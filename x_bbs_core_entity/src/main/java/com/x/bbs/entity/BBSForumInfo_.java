/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package com.x.bbs.entity;

import com.x.base.core.entity.SliceJpaObject_;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=com.x.bbs.entity.BBSForumInfo.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Fri Mar 10 10:08:02 CST 2017")
public class BBSForumInfo_ extends SliceJpaObject_  {
    public static volatile SingularAttribute<BBSForumInfo,Date> createTime;
    public static volatile SingularAttribute<BBSForumInfo,String> creatorName;
    public static volatile SingularAttribute<BBSForumInfo,String> forumColor;
    public static volatile SingularAttribute<BBSForumInfo,String> forumIndexStyle;
    public static volatile SingularAttribute<BBSForumInfo,String> forumManagerName;
    public static volatile SingularAttribute<BBSForumInfo,String> forumName;
    public static volatile SingularAttribute<BBSForumInfo,String> forumNotice;
    public static volatile SingularAttribute<BBSForumInfo,String> forumStatus;
    public static volatile SingularAttribute<BBSForumInfo,String> forumVisiable;
    public static volatile SingularAttribute<BBSForumInfo,String> id;
    public static volatile SingularAttribute<BBSForumInfo,String> indexListStyle;
    public static volatile SingularAttribute<BBSForumInfo,Boolean> indexRecommendable;
    public static volatile SingularAttribute<BBSForumInfo,Integer> orderNumber;
    public static volatile SingularAttribute<BBSForumInfo,Boolean> replyNeedAudit;
    public static volatile SingularAttribute<BBSForumInfo,String> replyPublishAble;
    public static volatile SingularAttribute<BBSForumInfo,Long> replyTotal;
    public static volatile SingularAttribute<BBSForumInfo,Long> replyTotalToday;
    public static volatile SingularAttribute<BBSForumInfo,Boolean> sectionCreateAble;
    public static volatile SingularAttribute<BBSForumInfo,Long> sectionTotal;
    public static volatile SingularAttribute<BBSForumInfo,String> sequence;
    public static volatile SingularAttribute<BBSForumInfo,Boolean> subjectNeedAudit;
    public static volatile SingularAttribute<BBSForumInfo,String> subjectPublishAble;
    public static volatile SingularAttribute<BBSForumInfo,Long> subjectTotal;
    public static volatile SingularAttribute<BBSForumInfo,Long> subjectTotalToday;
    public static volatile SingularAttribute<BBSForumInfo,String> subjectType;
    public static volatile SingularAttribute<BBSForumInfo,String> typeCatagory;
    public static volatile SingularAttribute<BBSForumInfo,Date> updateTime;
}
