package src;


public class EmployeeTest {

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setId(101);
        emp.setFirstName("Jane");
        emp.setLastName("Smith");
        emp.setSsn ("012-34-5678");
        emp.setSalary(120_345.27);
        System.out.println ("Employee id:         " + emp.getId());
        System.out.println ("Employee name:       " + emp.getFirstName() + emp.getLastName());
        System.out.println ("Employee Soc Sec #:  " + emp.getSsn());
        System.out.println ("Employee salary:     " + emp.getSalary());
    }
}
