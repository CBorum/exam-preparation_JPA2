package exam_prep_jpa2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author ChristopherBorum
 */
public class Facade {
    EntityManagerFactory emf;

    public Facade(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    //add edit find delete - persons students employees phdstudents
    public Person createStudent(String firstName, String lastName, int age) {
        Person p = new Student();
        p.setFirstName(firstName);
        p.setLastName(lastName);
        p.setAge(age);
        return p;
    }
    
    public Person createEmployee(String firstName, String lastName, int age) {
        Person p = new Employee();
        p.setFirstName(firstName);
        p.setLastName(lastName);
        p.setAge(age);
        return p;
    }
    
    
    
}
