package hibernate_test2;

import hibernate_test2.entity.Detail;
import hibernate_test2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();) {
//            Session session = factory.getCurrentSession();
//
//            Employee employee = new Employee("Aleks", "Philimonov", "IT", 400);
//            Detail detail = new Detail("Minsk", "1245789895", "aleksandrphilimonov@gmail.com");
//
//            employee.setEmpDetail(detail);
//
//            session.beginTransaction();
//            session.save(employee);
//
//            session.getTransaction().commit();
//            System.out.println("\nDONE!!!");

//            Session session = factory.getCurrentSession();
//
//            Employee employee = new Employee("Boris", "Jonson", "UK", 500);
//            Detail detail = new Detail("Lombon", "98985545", "bJonson@rambler.ru");
//
//            employee.setEmpDetail(detail);
//
//            session.beginTransaction();
//            session.save(employee);
//
//            session.getTransaction().commit();
//            System.out.println("\nDONE!!!");

            session.beginTransaction();
            Employee emp = session.get(Employee.class, 10);
            System.out.println(emp.getEmpDetail());

            session.getTransaction().commit();
            System.out.println("\nDONE!!!");
        }
    }
}
