/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package com.x.okr.entity;

import com.x.base.core.entity.SliceJpaObject_;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.Date;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=com.x.okr.entity.OkrCenterWorkInfo.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Fri Mar 10 10:09:40 CST 2017")
public class OkrCenterWorkInfo_ extends SliceJpaObject_  {
    public static volatile ListAttribute<OkrCenterWorkInfo,String> attachmentList;
    public static volatile SingularAttribute<OkrCenterWorkInfo,String> auditLeaderCompanyName;
    public static volatile SingularAttribute<OkrCenterWorkInfo,String> auditLeaderIdentity;
    public static volatile SingularAttribute<OkrCenterWorkInfo,String> auditLeaderName;
    public static volatile SingularAttribute<OkrCenterWorkInfo,String> auditLeaderOrganizationName;
    public static volatile SingularAttribute<OkrCenterWorkInfo,Long> completedWorkCount;
    public static volatile SingularAttribute<OkrCenterWorkInfo,Date> createTime;
    public static volatile SingularAttribute<OkrCenterWorkInfo,String> creatorCompanyName;
    public static volatile SingularAttribute<OkrCenterWorkInfo,String> creatorIdentity;
    public static volatile SingularAttribute<OkrCenterWorkInfo,String> creatorName;
    public static volatile SingularAttribute<OkrCenterWorkInfo,String> creatorOrganizationName;
    public static volatile SingularAttribute<OkrCenterWorkInfo,Date> defaultCompleteDateLimit;
    public static volatile SingularAttribute<OkrCenterWorkInfo,String> defaultCompleteDateLimitStr;
    public static volatile SingularAttribute<OkrCenterWorkInfo,String> defaultLeader;
    public static volatile SingularAttribute<OkrCenterWorkInfo,String> defaultLeaderIdentity;
    public static volatile SingularAttribute<OkrCenterWorkInfo,String> defaultWorkLevel;
    public static volatile SingularAttribute<OkrCenterWorkInfo,String> defaultWorkType;
    public static volatile SingularAttribute<OkrCenterWorkInfo,String> deployDateStr;
    public static volatile SingularAttribute<OkrCenterWorkInfo,String> deployMonth;
    public static volatile SingularAttribute<OkrCenterWorkInfo,String> deployYear;
    public static volatile SingularAttribute<OkrCenterWorkInfo,String> deployerCompanyName;
    public static volatile SingularAttribute<OkrCenterWorkInfo,String> deployerIdentity;
    public static volatile SingularAttribute<OkrCenterWorkInfo,String> deployerName;
    public static volatile SingularAttribute<OkrCenterWorkInfo,String> deployerOrganizationName;
    public static volatile SingularAttribute<OkrCenterWorkInfo,String> description;
    public static volatile SingularAttribute<OkrCenterWorkInfo,Long> draftWorkCount;
    public static volatile SingularAttribute<OkrCenterWorkInfo,String> id;
    public static volatile SingularAttribute<OkrCenterWorkInfo,Boolean> isNeedAudit;
    public static volatile SingularAttribute<OkrCenterWorkInfo,Long> overtimeWorkCount;
    public static volatile SingularAttribute<OkrCenterWorkInfo,String> processStatus;
    public static volatile SingularAttribute<OkrCenterWorkInfo,Long> processingWorkCount;
    public static volatile SingularAttribute<OkrCenterWorkInfo,String> reportAuditLeaderIdentity;
    public static volatile SingularAttribute<OkrCenterWorkInfo,String> reportAuditLeaderName;
    public static volatile SingularAttribute<OkrCenterWorkInfo,String> sequence;
    public static volatile SingularAttribute<OkrCenterWorkInfo,String> status;
    public static volatile SingularAttribute<OkrCenterWorkInfo,String> title;
    public static volatile SingularAttribute<OkrCenterWorkInfo,Date> updateTime;
    public static volatile SingularAttribute<OkrCenterWorkInfo,Long> workTotal;
}
