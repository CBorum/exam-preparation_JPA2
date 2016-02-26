package exam_prep_jpa2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


/**
 *
 * @author ChristopherBorum
 */
public class Tester {
    public static void main(String[] args) {
        EntityManagerFactory emf;
        emf = Persistence.createEntityManagerFactory("JPA2PU");
        Facade f = new Facade(emf);
        EntityManager em = f.getEntityManager();
        
        try {
            em.getTransaction().begin();
            em.persist(f.createEmployee("EmpFirstName", "EmpLastName", 123));
            em.persist(f.createStudent("StudentFirstName", "StudentLastName", 123));
            //System.out.println(em.find(Person.class, 1L));
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
}
