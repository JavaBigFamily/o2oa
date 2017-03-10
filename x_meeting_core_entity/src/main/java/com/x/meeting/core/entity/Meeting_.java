/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package com.x.meeting.core.entity;

import com.x.base.core.entity.SliceJpaObject_;
import java.lang.Boolean;
import java.lang.String;
import java.util.Date;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=com.x.meeting.core.entity.Meeting.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Fri Mar 10 10:09:29 CST 2017")
public class Meeting_ extends SliceJpaObject_  {
    public static volatile ListAttribute<Meeting,String> acceptPersonList;
    public static volatile SingularAttribute<Meeting,Date> actualCompletedTime;
    public static volatile SingularAttribute<Meeting,Date> actualStartTime;
    public static volatile SingularAttribute<Meeting,String> applicant;
    public static volatile SingularAttribute<Meeting,String> auditor;
    public static volatile SingularAttribute<Meeting,Date> completedTime;
    public static volatile SingularAttribute<Meeting,ConfirmStatus> confirmStatus;
    public static volatile SingularAttribute<Meeting,Date> createTime;
    public static volatile SingularAttribute<Meeting,String> description;
    public static volatile SingularAttribute<Meeting,String> id;
    public static volatile ListAttribute<Meeting,String> invitePersonList;
    public static volatile SingularAttribute<Meeting,Boolean> manualCompleted;
    public static volatile SingularAttribute<Meeting,String> memo;
    public static volatile SingularAttribute<Meeting,String> pinyin;
    public static volatile SingularAttribute<Meeting,String> pinyinInitial;
    public static volatile ListAttribute<Meeting,String> rejectPersonList;
    public static volatile SingularAttribute<Meeting,String> room;
    public static volatile SingularAttribute<Meeting,String> sequence;
    public static volatile SingularAttribute<Meeting,Date> startTime;
    public static volatile SingularAttribute<Meeting,String> subject;
    public static volatile SingularAttribute<Meeting,Date> updateTime;
}
