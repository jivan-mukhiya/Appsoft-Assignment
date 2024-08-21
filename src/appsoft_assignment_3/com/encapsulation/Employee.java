package appsoft_assignment_3.com.encapsulation;

import java.text.NumberFormat;

public class Employee {

    //Employee properties
    private int empId;
    private String name;
    private String ssn;
    private double salary;

    //All args Constructor
    public Employee(String name, double salary, String ssn, int empId) {
        this.name = name;
        this.salary = salary;
        this.ssn = ssn;
        this.empId = empId;
    }

    //Setter method for Name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for all properties
    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public double getSalary() {
        return salary;
    }

    //Method for rise Salary
    public void riseSalary(double increase) {

        salary +=increase;

    }


    //For Print Employee
    public  void  print(){

        //Using NumberFormating
        String sal=NumberFormat.getCurrencyInstance().format(salary);


        System.out.println("Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                ", salary=" + sal +
                '}');

    }
}
