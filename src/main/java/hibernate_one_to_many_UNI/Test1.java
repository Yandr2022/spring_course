package hibernate_one_to_many_UNI;


import hibernate_one_to_many_UNI.entity.Department;
import hibernate_one_to_many_UNI.entity.Employee;
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
//            Department department = new Department("HR", 500, 1500);
//            Employee emp1 = new Employee("Oleg", "Ivanov", 1000);
//            Employee emp2 = new Employee("Maria", "Petrova", 1200);
//            department.addEmployeeToDepartment(emp1);
//            department.addEmployeeToDepartment(emp2);
//            session.beginTransaction();
//            session.save(department);
            session.beginTransaction();
            Department department = session.get(Department.class, 3);
//            Employee employee = session.get(Employee.class,5);
            session.delete(department);
//            System.out.println(department + "\n" + department.getEmps());
            session.getTransaction().commit();
            System.out.println("Done!!!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
