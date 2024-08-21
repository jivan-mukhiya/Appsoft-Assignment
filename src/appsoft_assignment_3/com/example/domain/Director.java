package appsoft_assignment_3.com.example.domain;

import appsoft_assignment_3.com.encapsulation.Manager;

public class Director extends Manager {
     private double budget;

    public Director(String name, double salary, String ssn, int empId, String deptName,double budget) {
        super(name, salary, ssn, empId, deptName);
        this.budget = budget;
    }



    //Getter method for Budget
    public double getBudget() {
        return budget;
    }
}
