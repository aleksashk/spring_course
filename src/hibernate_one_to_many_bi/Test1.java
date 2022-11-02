package hibernate_one_to_many_bi;

import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
             Session session = factory.getCurrentSession()) {
//
//            Department department = new Department("IT", 300, 1200);
//            Employee emp1 = new Employee("Aleksandr", "Philimonov", 800);
//            Employee emp2 = new Employee("Olga", "Smirnova", 1000);
//            Employee emp3 = new Employee("Pavel", "Sidorov", 1200);
//
//            department.addEmployeeToDepartment(emp1);
//            department.addEmployeeToDepartment(emp2);
//            department.addEmployeeToDepartment(emp3);
//            session.beginTransaction();
//            session.save(department);
//*************************************************************************

            session.beginTransaction();
            Department department = session.get(Department.class, 1);
            System.out.println(department);
            System.out.println(department.getEmps());

            session.getTransaction().commit();
            System.out.println("\nDONE!!!");
//*************************************************************************

//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 1);
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//
//            session.getTransaction().commit();
//            System.out.println("\nDONE!!!");
//*************************************************************************
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 4);
//            session.delete(employee);

            session.getTransaction().commit();
            System.out.println("\nDONE!!!");
        }
    }
}
