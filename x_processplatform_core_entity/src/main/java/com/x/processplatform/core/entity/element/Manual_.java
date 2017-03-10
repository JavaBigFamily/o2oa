/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package com.x.processplatform.core.entity.element;

import com.x.base.core.entity.SliceJpaObject_;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=com.x.processplatform.core.entity.element.Manual.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Fri Mar 10 10:10:19 CST 2017")
public class Manual_ extends SliceJpaObject_  {
    public static volatile SingularAttribute<Manual,String> afterArriveScript;
    public static volatile SingularAttribute<Manual,String> afterArriveScriptText;
    public static volatile SingularAttribute<Manual,String> afterArrivedExecuteScript;
    public static volatile SingularAttribute<Manual,String> afterArrivedExecuteScriptText;
    public static volatile SingularAttribute<Manual,String> afterExecuteScript;
    public static volatile SingularAttribute<Manual,String> afterExecuteScriptText;
    public static volatile SingularAttribute<Manual,String> afterInquireScript;
    public static volatile SingularAttribute<Manual,String> afterInquireScriptText;
    public static volatile SingularAttribute<Manual,String> alias;
    public static volatile SingularAttribute<Manual,Boolean> allowDeleteWork;
    public static volatile SingularAttribute<Manual,Boolean> allowRapid;
    public static volatile SingularAttribute<Manual,Boolean> allowReroute;
    public static volatile SingularAttribute<Manual,Boolean> allowRerouteTo;
    public static volatile SingularAttribute<Manual,Boolean> allowReset;
    public static volatile SingularAttribute<Manual,Boolean> allowRetract;
    public static volatile SingularAttribute<Manual,Boolean> allowRollback;
    public static volatile SingularAttribute<Manual,String> beforeArriveScript;
    public static volatile SingularAttribute<Manual,String> beforeArriveScriptText;
    public static volatile SingularAttribute<Manual,String> beforeArrivedExecuteScript;
    public static volatile SingularAttribute<Manual,String> beforeArrivedExecuteScriptText;
    public static volatile SingularAttribute<Manual,String> beforeExecuteScript;
    public static volatile SingularAttribute<Manual,String> beforeExecuteScriptText;
    public static volatile SingularAttribute<Manual,String> beforeInquireScript;
    public static volatile SingularAttribute<Manual,String> beforeInquireScriptText;
    public static volatile SingularAttribute<Manual,Date> createTime;
    public static volatile SingularAttribute<Manual,String> description;
    public static volatile SingularAttribute<Manual,String> extension;
    public static volatile SingularAttribute<Manual,String> form;
    public static volatile SingularAttribute<Manual,String> group;
    public static volatile SingularAttribute<Manual,String> id;
    public static volatile SingularAttribute<Manual,ManualMode> manualMode;
    public static volatile SingularAttribute<Manual,String> name;
    public static volatile SingularAttribute<Manual,String> position;
    public static volatile SingularAttribute<Manual,String> process;
    public static volatile ListAttribute<Manual,String> readDataPathList;
    public static volatile ListAttribute<Manual,String> readDepartmentList;
    public static volatile SingularAttribute<Manual,String> readDuty;
    public static volatile ListAttribute<Manual,String> readIdentityList;
    public static volatile SingularAttribute<Manual,String> readScript;
    public static volatile SingularAttribute<Manual,String> readScriptText;
    public static volatile SingularAttribute<Manual,Integer> resetCount;
    public static volatile SingularAttribute<Manual,ResetRange> resetRange;
    public static volatile ListAttribute<Manual,String> reviewDataPathList;
    public static volatile ListAttribute<Manual,String> reviewDepartmentList;
    public static volatile SingularAttribute<Manual,String> reviewDuty;
    public static volatile ListAttribute<Manual,String> reviewIdentityList;
    public static volatile SingularAttribute<Manual,String> reviewScript;
    public static volatile SingularAttribute<Manual,String> reviewScriptText;
    public static volatile ListAttribute<Manual,String> routeList;
    public static volatile SingularAttribute<Manual,String> sequence;
    public static volatile ListAttribute<Manual,String> taskDataPathList;
    public static volatile ListAttribute<Manual,String> taskDepartmentList;
    public static volatile SingularAttribute<Manual,String> taskDuty;
    public static volatile SingularAttribute<Manual,Integer> taskExpireDay;
    public static volatile SingularAttribute<Manual,Integer> taskExpireHour;
    public static volatile SingularAttribute<Manual,String> taskExpireScript;
    public static volatile SingularAttribute<Manual,String> taskExpireScriptText;
    public static volatile SingularAttribute<Manual,ExpireType> taskExpireType;
    public static volatile SingularAttribute<Manual,Boolean> taskExpireWorkTime;
    public static volatile ListAttribute<Manual,String> taskIdentityList;
    public static volatile SingularAttribute<Manual,String> taskScript;
    public static volatile SingularAttribute<Manual,String> taskScriptText;
    public static volatile SingularAttribute<Manual,Date> updateTime;
}
