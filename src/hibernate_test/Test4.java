package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test4 {
    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session;
            session = factory.getCurrentSession();
            session.beginTransaction();

//            Employee emp = session.get(Employee.class, 1);
//            emp.setSalary(1600);

            session.createQuery("update Employee set salary=999 " +
                    "where name='Aleksandr'").executeUpdate();

            session.getTransaction().commit();

            System.out.println("Done!!!");
        }
    }
}
