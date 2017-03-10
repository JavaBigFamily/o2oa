MWF.xDesktop.requireApp("process.Xform", "$Module", null, false);
MWF.xApplication.process.Xform.ImageClipper = MWF.APPImageClipper =  new Class({
	Implements: [Events],
	Extends: MWF.APP$Module,
    initialize: function(node, json, form, options){

        this.node = $(node);
        this.node.store("module", this);
        this.json = json;
        this.form = form;
        this.field = true;
    },
	_loadUserInterface: function(){
        this.field = true;
        this.node.empty();
        var data = this._getBusinessData();
        if( data ){
            var img = new Element("img",{
                src : MWF.xDesktop.getImageSrc( data )
            });
            if( this.json.clipperType == "size" ){
                var width = this.json.imageWidth;
                var height = this.json.imageHeight;
                if( width && height ){
                    img.setStyles({
                        width : width+"px",
                        height : height+"px"
                    })
                }
            }
            img.inject( this.node );
        }
        if( this.readonly )return;

        var divBottom = new Element("div").inject( this.node );
        var button = new Element("button").inject(divBottom);
        button.set({
			//"id": this.json.id,
			"text": this.json.name || this.json.id,
			"styles": this.form.css.buttonStyles,
			"MWFType": this.json.type
        });
        button.addEvent("click", function(){
            this.validationMode();
            var d = this._getBusinessData();
            this.selectImage( d, function(data){
                this.setData( data ? data.id : "" );
                this.validation();
            }.bind(this));
        }.bind(this));
	},
    getData: function( data ){
        return this._getBusinessData() || "";
    },
    setData: function( data ){
        this._setBusinessData(data);
        var img = this.node.getElements("img");
        if( img && img.length )img.destroy();
        if( !data )return;
        var img = new Element("img",{
            src : MWF.xDesktop.getImageSrc( data )
        }).inject( this.node, "top" );
        if( this.json.clipperType == "size" ){
            var width = this.json.imageWidth;
            var height = this.json.imageHeight;
            if( width && height ){
                img.setStyles({
                    width : width+"px",
                    height : height+"px"
                })
            }
        }
    },

    selectImage: function(d, callback){
        var clipperType = this.json.clipperType || "unrestricted";
        var ratio = 1;
        if( clipperType == "unrestricted" ){
            ratio = 0;
        }else if( clipperType == "size" ){
            var width = this.json.imageWidth.toInt();
            var height = this.json.imageHeight.toInt();
            ratio = width / height
        }else if( clipperType == "ratio" ){
            ratio = this.json.imageRatio || 1
        }
        MWF.xDesktop.requireApp("process.Xform", "widget.ImageClipper", function(){
            this.imageClipper = new MWF.xApplication.process.Xform.widget.ImageClipper(this.form.app, {
                "style": "default",
                "aspectRatio" : ratio,
                "imageUrl" : d ? MWF.xDesktop.getImageSrc( d ) : "",
                "reference" : this.form.businessData.work.job,
                "referenceType": "processPlatformJob",
                "onChange" : function(){
                    callback( { src : this.imageClipper.imageSrc, id : this.imageClipper.imageId } );
                }.bind(this)
            });
            this.imageClipper.load();
        }.bind(this));
    },
    createErrorNode: function(text){
        var node = new Element("div");
        var iconNode = new Element("div", {
            "styles": {
                "width": "20px",
                "height": "20px",
                "float": "left",
                "background": "url("+"/x_component_process_Xform/$Form/default/icon/error.png) center center no-repeat"
            }
        }).inject(node);
        var textNode = new Element("div", {
            "styles": {
                "line-height": "20px",
                "margin-left": "20px",
                "color": "red"
            },
            "text": text
        }).inject(node);
        return node;
    },
    notValidationMode: function(text){
        if (!this.isNotValidationMode){
            this.isNotValidationMode = true;
            this.node.store("borderStyle", this.node.getStyles("border-left", "border-right", "border-top", "border-bottom"));
            this.node.setStyle("border", "1px solid red");

            this.errNode = this.createErrorNode(text).inject(this.node, "after");
            this.showNotValidationMode(this.node);
        }
    },
    showNotValidationMode: function(node){
        var p = node.getParent("div");
        if (p){
            if (p.get("MWFtype") == "tab$Content"){
                if (p.getParent("div").getStyle("display")=="none"){
                    var contentAreaNode = p.getParent("div").getParent("div");
                    var tabAreaNode = contentAreaNode.getPrevious("div");
                    var idx = contentAreaNode.getChildren().indexOf(p.getParent("div"));
                    var tabNode = tabAreaNode.getChildren()[idx];
                    tabNode.click();
                    p = tabAreaNode.getParent("div");
                }
            }
            this.showNotValidationMode(p);
        }
    },
    validationMode: function(){
        if (this.isNotValidationMode){
            this.isNotValidationMode = false;
            this.node.setStyles(this.node.retrieve("borderStyle"));
            if (this.errNode){
                this.errNode.destroy();
                this.errNode = null;
            }
        }
    },
    validationConfigItem: function(routeName, data){
        var flag = (data.status=="all") ? true: (routeName == data.decision);
        if (flag){
            var n = this.getData();
            var v = (data.valueType=="value") ? n : n.length;
            switch (data.operateor){
                case "isnull":
                    if (!v){
                        this.notValidationMode(data.prompt);
                        return false;
                    }
                    break;
                case "notnull":
                    if (v){
                        this.notValidationMode(data.prompt);
                        return false;
                    }
                    break;
                case "gt":
                    if (v>data.value){
                        this.notValidationMode(data.prompt);
                        return false;
                    }
                    break;
                case "lt":
                    if (v<data.value){
                        this.notValidationMode(data.prompt);
                        return false;
                    }
                    break;
                case "equal":
                    if (v==data.value){
                        this.notValidationMode(data.prompt);
                        return false;
                    }
                    break;
                case "neq":
                    if (v!=data.value){
                        this.notValidationMode(data.prompt);
                        return false;
                    }
                    break;
                case "contain":
                    if (v.indexOf(data.value)!=-1){
                        this.notValidationMode(data.prompt);
                        return false;
                    }
                    break;
                case "notcontain":
                    if (v.indexOf(data.value)==-1){
                        this.notValidationMode(data.prompt);
                        return false;
                    }
                    break;
            }
        }
        return true;
    },
    validationConfig: function(routeName, opinion){
        if (this.json.validationConfig){
            if (this.json.validationConfig.length){
                for (var i=0; i<this.json.validationConfig.length; i++) {
                    var data = this.json.validationConfig[i];
                    if (!this.validationConfigItem(routeName, data)) return false;
                }
            }
            return true;
        }
        return true;
    },
    validation: function(routeName, opinion){
        if (!this.validationConfig(routeName, opinion))  return false;

        if (!this.json.validation) return true;
        if (!this.json.validation.code) return true;
        var flag = this.form.Macro.exec(this.json.validation.code, this);
        if (!flag) flag = MWF.xApplication.process.Xform.LP.notValidation;
        if (flag.toString()!="true"){
            this.notValidationMode(flag);
            return false;
        }
        return true;
    }
	
}); 