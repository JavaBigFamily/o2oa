MWF.xApplication.process.Xform = MWF.xApplication.process.Xform || {};
MWF.xApplication.cms.Xform = MWF.xApplication.cms.Xform || {};
MWF.require("MWF.xScript.CMSMacro", null, false);
MWF.xDesktop.requireApp("process.Xform", "$Module", null, false);
MWF.xDesktop.requireApp("cms.Xform", "ModuleImplements", null, false);
MWF.xDesktop.requireApp("cms.Xform", "Label", null, false);
MWF.xDesktop.requireApp("cms.Xform", "Textfield", null, false);
MWF.xDesktop.requireApp("cms.Xform", "Number", null, false);
MWF.xDesktop.requireApp("cms.Xform", "Personfield", null, false);
MWF.xDesktop.requireApp("cms.Xform", "Readerfield", null, false);
MWF.xDesktop.requireApp("cms.Xform", "Calendar", null, false);
MWF.xDesktop.requireApp("cms.Xform", "Textarea", null, false);
MWF.xDesktop.requireApp("cms.Xform", "Select", null, false);
MWF.xDesktop.requireApp("cms.Xform", "Radio", null, false);
MWF.xDesktop.requireApp("cms.Xform", "Checkbox", null, false);
MWF.xDesktop.requireApp("cms.Xform", "Button", null, false);

MWF.xApplication.process.Xform.Div = MWF.APPDiv = MWF.xApplication.cms.Xform.Div = MWF.CMSDiv = new Class({
	Extends: MWF.APP$Module
});

MWF.xApplication.process.Xform.Image = MWF.APPImage = MWF.xApplication.cms.Xform.Image = MWF.CMSImage = new Class({
	Extends: MWF.APP$Module
});

MWF.xDesktop.requireApp("cms.Xform", "ImageClipper", null, false);
MWF.xDesktop.requireApp("cms.Xform", "Table", null, false);
MWF.xDesktop.requireApp("cms.Xform", "Datagrid", null, false);

MWF.xApplication.process.Xform.Html = MWF.APPHtml = MWF.xApplication.cms.Xform.Html = MWF.CMSHtml =  new Class({
	Extends: MWF.APP$Module,
	load: function(){
		this.node.insertAdjacentHTML("beforebegin", this.json.text);
		this.node.destroy();
	}
});

MWF.xDesktop.requireApp("cms.Xform", "Tab", null, false);

MWF.xApplication.process.Xform.tab$Page = MWF.APPTab$Page = MWF.xApplication.cms.Xform.tab$Page = MWF.CMSTab$Page = new Class({
	Extends: MWF.APP$Module
});
MWF.xApplication.process.Xform.tab$Content = MWF.APPTab$Content = MWF.xApplication.cms.Xform.tab$Content = MWF.CMSTab$Content = new Class({
	Extends: MWF.APP$Module
});

MWF.xDesktop.requireApp("cms.Xform", "Tree", null, false);

MWF.xDesktop.requireApp("cms.Xform", "Iframe", null, false);
MWF.xDesktop.requireApp("cms.Xform", "Htmleditor", null, false);
MWF.xDesktop.requireApp("cms.Xform", "Office", null, false);
MWF.xDesktop.requireApp("cms.Xform", "Attachment", null, false);
MWF.xDesktop.requireApp("cms.Xform", "Actionbar", null, false);
//MWF.xDesktop.requireApp("process.Xform", "Log", null, false);
//MWF.xDesktop.requireApp("process.Xform", "Monitor", null, false);
MWF.xDesktop.requireApp("cms.Xform", "View", null, false);
MWF.xDesktop.requireApp("cms.Xform", "ViewSelector", null, false);