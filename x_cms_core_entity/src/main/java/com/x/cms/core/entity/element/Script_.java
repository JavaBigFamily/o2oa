/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package com.x.cms.core.entity.element;

import com.x.base.core.entity.SliceJpaObject_;
import java.lang.Boolean;
import java.lang.String;
import java.util.Date;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=com.x.cms.core.entity.element.Script.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Fri Mar 10 13:46:13 CST 2017")
public class Script_ extends SliceJpaObject_  {
    public static volatile SingularAttribute<Script,String> alias;
    public static volatile SingularAttribute<Script,String> appId;
    public static volatile SingularAttribute<Script,Date> createTime;
    public static volatile SingularAttribute<Script,String> creatorPerson;
    public static volatile ListAttribute<Script,String> dependScriptList;
    public static volatile SingularAttribute<Script,String> description;
    public static volatile SingularAttribute<Script,String> id;
    public static volatile SingularAttribute<Script,String> lastUpdatePerson;
    public static volatile SingularAttribute<Script,Date> lastUpdateTime;
    public static volatile SingularAttribute<Script,String> name;
    public static volatile SingularAttribute<Script,String> sequence;
    public static volatile SingularAttribute<Script,String> text;
    public static volatile SingularAttribute<Script,Date> updateTime;
    public static volatile SingularAttribute<Script,Boolean> validated;
}
