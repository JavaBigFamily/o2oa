/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package com.x.processplatform.core.entity.element;

import com.x.base.core.entity.SliceJpaObject_;
import java.lang.Boolean;
import java.lang.String;
import java.util.Date;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=com.x.processplatform.core.entity.element.Embed.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Fri Mar 10 10:10:19 CST 2017")
public class Embed_ extends SliceJpaObject_  {
    public static volatile SingularAttribute<Embed,String> afterArriveScript;
    public static volatile SingularAttribute<Embed,String> afterArriveScriptText;
    public static volatile SingularAttribute<Embed,String> afterExecuteScript;
    public static volatile SingularAttribute<Embed,String> afterExecuteScriptText;
    public static volatile SingularAttribute<Embed,String> afterInquireScript;
    public static volatile SingularAttribute<Embed,String> afterInquireScriptText;
    public static volatile SingularAttribute<Embed,String> alias;
    public static volatile SingularAttribute<Embed,Boolean> allowReroute;
    public static volatile SingularAttribute<Embed,Boolean> allowRerouteTo;
    public static volatile SingularAttribute<Embed,String> beforeArriveScript;
    public static volatile SingularAttribute<Embed,String> beforeArriveScriptText;
    public static volatile SingularAttribute<Embed,String> beforeExecuteScript;
    public static volatile SingularAttribute<Embed,String> beforeExecuteScriptText;
    public static volatile SingularAttribute<Embed,String> beforeInquireScript;
    public static volatile SingularAttribute<Embed,String> beforeInquireScriptText;
    public static volatile SingularAttribute<Embed,Date> createTime;
    public static volatile SingularAttribute<Embed,String> description;
    public static volatile SingularAttribute<Embed,EmbedCreatorType> embedCreatorType;
    public static volatile SingularAttribute<Embed,String> extension;
    public static volatile SingularAttribute<Embed,String> form;
    public static volatile SingularAttribute<Embed,String> id;
    public static volatile SingularAttribute<Embed,Boolean> inheritData;
    public static volatile SingularAttribute<Embed,String> name;
    public static volatile SingularAttribute<Embed,String> position;
    public static volatile SingularAttribute<Embed,String> process;
    public static volatile ListAttribute<Embed,String> readDataPathList;
    public static volatile ListAttribute<Embed,String> readDepartmentList;
    public static volatile SingularAttribute<Embed,String> readDuty;
    public static volatile ListAttribute<Embed,String> readIdentityList;
    public static volatile SingularAttribute<Embed,String> readScript;
    public static volatile SingularAttribute<Embed,String> readScriptText;
    public static volatile ListAttribute<Embed,String> reviewDataPathList;
    public static volatile ListAttribute<Embed,String> reviewDepartmentList;
    public static volatile SingularAttribute<Embed,String> reviewDuty;
    public static volatile ListAttribute<Embed,String> reviewIdentityList;
    public static volatile SingularAttribute<Embed,String> reviewScript;
    public static volatile SingularAttribute<Embed,String> reviewScriptText;
    public static volatile SingularAttribute<Embed,String> route;
    public static volatile SingularAttribute<Embed,String> sequence;
    public static volatile SingularAttribute<Embed,String> targetApplication;
    public static volatile SingularAttribute<Embed,String> targetApplicationAlias;
    public static volatile SingularAttribute<Embed,String> targetApplicationName;
    public static volatile SingularAttribute<Embed,String> targetIdentity;
    public static volatile SingularAttribute<Embed,String> targetIdentityScript;
    public static volatile SingularAttribute<Embed,String> targetIdentityScriptText;
    public static volatile SingularAttribute<Embed,String> targetProcess;
    public static volatile SingularAttribute<Embed,String> targetProcessAlias;
    public static volatile SingularAttribute<Embed,String> targetProcessName;
    public static volatile SingularAttribute<Embed,String> titleScript;
    public static volatile SingularAttribute<Embed,String> titleScriptText;
    public static volatile SingularAttribute<Embed,Date> updateTime;
}
