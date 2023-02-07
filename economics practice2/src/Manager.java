package src;

public class Manager extends Employee {
    private String deptName;

    public Manager(int id, String fname, String lname, String ssn, double salary, String deptName ) {
        super(id,fname,lname,ssn,salary);
        this.deptName=deptName;
    }
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public void display() {

        System.out.println(this.deptName);
    }

}
