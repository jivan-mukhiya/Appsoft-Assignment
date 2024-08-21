package appsoft_assignment_3.com.encapsulation;

public class Manager extends Employee{
private  String deptName;


    public Manager(String name, double salary, String ssn, int empId, String deptName) {
        super(name, salary, ssn, empId);
        this.deptName = deptName;
    }

    //Getter Method for department Name

    public String getDeptName() {
        return deptName;
    }
}
