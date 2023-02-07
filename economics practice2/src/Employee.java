package src;
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String ssn;
    private double salary;

    public Employee() {

    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }


    public Employee(int id, String firstName, String lastName,String ssn, double salary) {
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.ssn = ssn;
        this.setSalary(salary);
    }

    //setter n getter
    public void setId(int id) {
        //code to validdate value of id
        this.id=id;
    }
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public double getSalary() {

        return salary;
    }
    public void setSalary(double salary) {
        if(salary>3000) {
            this.salary = salary;
        }else {
            System.out.println("Error-Salary is not assigned");
        }
    }
    public void raiseSalary(double salary) {

        this.salary = salary * 2;
        System.out.println("salary double increase");
    }

    // operation or method to print
    public void display() {
        System.out.println(this.id);
        System.out.println(this.firstName);
        System.out.println(this.lastName);
        System.out.println(this.ssn);
        System.out.println(this.salary);
    }
}
