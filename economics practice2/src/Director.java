package src;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Director extends Manager {
    private Double budget;

    public Director(int id, String fname, String lname,String ssn, double salary, String deptName, Double budget) {
        super(id,fname,lname,ssn,salary, deptName);
        this.budget=budget;
    }
    public double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    @Override
    public void display() {

        System.out.println(this.budget);
    }

}
