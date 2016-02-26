package exam_prep_jpa2;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-02-25T15:22:48")
@StaticMetamodel(Employee.class)
public class Employee_ extends Person_ {

    public static volatile SingularAttribute<Employee, String> taxClass;
    public static volatile SingularAttribute<Employee, Integer> soSecNr;
    public static volatile SingularAttribute<Employee, Float> wage;

}