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
//            Employee emp2 = new Employee("Igor", "Sidorov", 300);
//            Employee emp3 = new Employee("Maria", "Petrova", 1500);
//            department.addEmployeeToDepartment(emp1);
//            department.addEmployeeToDepartment(emp2);
//            department.addEmployeeToDepartment(emp3);
//            session.beginTransaction();
//            session.save(department);
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class,4);
//            session.delete(employee);
            session.beginTransaction();
            System.out.println("Get department");
            Department department = session.get(Department.class, 4);
            System.out.println("Show department\n" + department);
            System.out.println("Loading employees of department" );
            department.getEmps().get(0);
            session.getTransaction().commit();
            System.out.println("Show employees of department\n" + department.getEmps());
            System.out.println("Done!!!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
