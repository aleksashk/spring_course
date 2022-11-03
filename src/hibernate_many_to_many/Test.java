package hibernate_many_to_many;

import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();
             Session session = sessionFactory.getCurrentSession()) {
            Section section1 = new Section("Football");
            Child child1 = new Child("Aleksandr", 4);
            Child child2 = new Child("Andrey", 3);
            Child child3 = new Child("Nicolay", 5);
            Child child4 = new Child("Dmitry", 6);

            section1.addChildToSection(child1);
            section1.addChildToSection(child2);
            section1.addChildToSection(child3);
            section1.addChildToSection(child4);

            session.beginTransaction();



            session.close();

            System.out.println("DONE!!!");
        }
    }
}
