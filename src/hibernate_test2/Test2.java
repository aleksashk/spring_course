package hibernate_test2;

import hibernate_test2.entity.Detail;
import hibernate_test2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
             Session session = factory.getCurrentSession();) {

            Employee employee = new Employee("Helga", "Kalistratova", "SALE", 45435);
            Detail detail = new Detail("NEW-York", "5654654654654", "khalisi@mail.ru");

            employee.setEmpDetail(detail);
            detail.setEmployee(employee);
            session.beginTransaction();

            session.save(detail);

            session.getTransaction().commit();
            System.out.println("\nDONE!!!");
        }
    }
}
