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
//            Section section1 = new Section("Football");
//            Child child1 = new Child("Aleksandr", 4);
//            Child child2 = new Child("Andrey", 3);
//            Child child3 = new Child("Nicolay", 5);
//            Child child4 = new Child("Dmitry", 6);
//
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//            section1.addChildToSection(child4);
//
//            session.beginTransaction();
//            session.save(section1);
//
//            session.getTransaction().commit();
//
//            session.close();
//            System.out.println("DONE!!!");
            //*******************************************************************************
//            Section section1 = new Section("Volleyball");
//            Section section2 = new Section("Chess");
//            Section section3 = new Section("Hokey");
//            Child child1 = new Child("Aleksey", 5);
//
//            child1.addSectionToChild(section1);
//            child1.addSectionToChild(section2);
//            child1.addSectionToChild(section3);
//
//            session.beginTransaction();
//            session.save(child1);
//
//            session.getTransaction().commit();
//
//            session.close();
//            System.out.println("DONE!!!");
            //*******************************************************************************

//            session.beginTransaction();
//            Section section = session.get(Section.class, 4);
//            System.out.println(section);
//            System.out.println(section.getChildren());
//
//            session.getTransaction().commit();
//
//            session.close();
//            System.out.println("DONE!!!");

            //***********************************************************************
            session.beginTransaction();
            Child child = session.get(Child.class, 9);
            System.out.println(child);
            System.out.println(child.getSections());

            session.getTransaction().commit();

            session.close();
            System.out.println("DONE!!!");
        }
    }
}
