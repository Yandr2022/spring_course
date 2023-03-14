package hibernate_many_to_many;


import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class).addAnnotatedClass(Section.class).buildSessionFactory();
        Session session = null;
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            Child child = session.get(Child.class,4);
            session.delete(child);
//            session.getTransaction().commit();
//            session.beginTransaction();
//            Child child= session.get(Child.class,4);
//            System.out.println(child + "\n" + child.getSections());
//            session.getTransaction().commit();
//            *****************************************************
//            Section section = new Section("VolleyBall");
//            Section section1 = new Section("Chess");
//            Section section2 = new Section("Math");
//            Child child = new Child("Igor", 8);
//            child.addSectionToChild(section);
//            child.addSectionToChild(section1);
//            child.addSectionToChild(section2);
//            session.beginTransaction();
//            session.save(child);
//            session.getTransaction().commit();
//            *****************************************************
//            Section section = new Section("Java");
//            Child child = new Child("Oleg", 10);
//            Child child1 = new Child("Yulia", 11);
//            Child child2 = new Child("Viktor", 17);
//            section.addChildToSection(child);
//            section.addChildToSection(child1);
//            section.addChildToSection(child2);
//            session.beginTransaction();
//            session.persist(section);
            session.getTransaction().commit();
//            *****************************************************

        } finally {
            session.close();
            factory.close();
        }
    }
}
