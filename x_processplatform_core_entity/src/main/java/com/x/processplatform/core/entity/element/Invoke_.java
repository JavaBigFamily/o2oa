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
(value=com.x.processplatform.core.entity.element.Invoke.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Fri Mar 10 10:10:19 CST 2017")
public class Invoke_ extends SliceJpaObject_  {
    public static volatile SingularAttribute<Invoke,String> afterArriveScript;
    public static volatile SingularAttribute<Invoke,String> afterArriveScriptText;
    public static volatile SingularAttribute<Invoke,String> afterExecuteScript;
    public static volatile SingularAttribute<Invoke,String> afterExecuteScriptText;
    public static volatile SingularAttribute<Invoke,String> afterInquireScript;
    public static volatile SingularAttribute<Invoke,String> afterInquireScriptText;
    public static volatile SingularAttribute<Invoke,String> alias;
    public static volatile SingularAttribute<Invoke,Boolean> allowReroute;
    public static volatile SingularAttribute<Invoke,Boolean> allowRerouteTo;
    public static volatile SingularAttribute<Invoke,String> beforeArriveScript;
    public static volatile SingularAttribute<Invoke,String> beforeArriveScriptText;
    public static volatile SingularAttribute<Invoke,String> beforeExecuteScript;
    public static volatile SingularAttribute<Invoke,String> beforeExecuteScriptText;
    public static volatile SingularAttribute<Invoke,String> beforeInquireScript;
    public static volatile SingularAttribute<Invoke,String> beforeInquireScriptText;
    public static volatile SingularAttribute<Invoke,Date> createTime;
    public static volatile SingularAttribute<Invoke,String> description;
    public static volatile SingularAttribute<Invoke,String> extension;
    public static volatile SingularAttribute<Invoke,String> form;
    public static volatile SingularAttribute<Invoke,String> id;
    public static volatile SingularAttribute<Invoke,InvokeMode> invokeMode;
    public static volatile SingularAttribute<Invoke,String> jaxrsAddress;
    public static volatile SingularAttribute<Invoke,String> jaxrsBodyScript;
    public static volatile SingularAttribute<Invoke,String> jaxrsBodyScriptText;
    public static volatile SingularAttribute<Invoke,String> jaxrsContentType;
    public static volatile SingularAttribute<Invoke,String> jaxrsMethod;
    public static volatile SingularAttribute<Invoke,String> jaxrsParameterScript;
    public static volatile SingularAttribute<Invoke,String> jaxrsParameterScriptText;
    public static volatile SingularAttribute<Invoke,String> jaxrsResponseScript;
    public static volatile SingularAttribute<Invoke,String> jaxrsResponseScriptText;
    public static volatile SingularAttribute<Invoke,Boolean> jaxrsWithCipher;
    public static volatile SingularAttribute<Invoke,String> jaxwsAddress;
    public static volatile SingularAttribute<Invoke,String> jaxwsMethod;
    public static volatile SingularAttribute<Invoke,String> jaxwsParameterScript;
    public static volatile SingularAttribute<Invoke,String> jaxwsParameterScriptText;
    public static volatile SingularAttribute<Invoke,String> jaxwsResponseScript;
    public static volatile SingularAttribute<Invoke,String> jaxwsResponseScriptText;
    public static volatile SingularAttribute<Invoke,String> name;
    public static volatile SingularAttribute<Invoke,String> position;
    public static volatile SingularAttribute<Invoke,String> process;
    public static volatile ListAttribute<Invoke,String> readDataPathList;
    public static volatile ListAttribute<Invoke,String> readDepartmentList;
    public static volatile SingularAttribute<Invoke,String> readDuty;
    public static volatile ListAttribute<Invoke,String> readIdentityList;
    public static volatile SingularAttribute<Invoke,String> readScript;
    public static volatile SingularAttribute<Invoke,String> readScriptText;
    public static volatile ListAttribute<Invoke,String> reviewDataPathList;
    public static volatile ListAttribute<Invoke,String> reviewDepartmentList;
    public static volatile SingularAttribute<Invoke,String> reviewDuty;
    public static volatile ListAttribute<Invoke,String> reviewIdentityList;
    public static volatile SingularAttribute<Invoke,String> reviewScript;
    public static volatile SingularAttribute<Invoke,String> reviewScriptText;
    public static volatile SingularAttribute<Invoke,String> route;
    public static volatile SingularAttribute<Invoke,String> sequence;
    public static volatile SingularAttribute<Invoke,Date> updateTime;
}
