package hibernate_one_to_many_BI;

import hibernate_one_to_many_BI.entity.Department;
import hibernate_one_to_many_BI.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class).addAnnotatedClass(Department.class).buildSessionFactory();
        Session session = null;
        try {
            session = factory.getCurrentSession();
//            Department department = new Department("IT", 300, 1200);
//            Employee emp1 = new Employee("Ivan", "Smirnov", 800);
//            Employee emp2 = new Employee("Igor", "Sidorov", 600);
//            department.addEmployeeToDepartment(emp1);
//            department.addEmployeeToDepartment(emp2);
//            session.beginTransaction();
//            session.save(department);
            session.beginTransaction();
            Employee employee = session.get(Employee.class,4);
            session.delete(employee);
            session.getTransaction().commit();
            System.out.println("Done!!!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
