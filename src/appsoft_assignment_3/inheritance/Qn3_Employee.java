package appsoft_assignment_3.inheritance;

public class Qn3_Employee extends Qn3_Member{

    String specialization;
    String department;

    void displayEmployee(){
        System.out.println("Name of Employee: "+name);
        System.out.println("Age of Employee: "+age);
        System.out.println("Phone Number of Employee: "+phoneNumber);
        System.out.println("Address of Employee: "+address);
        System.out.println("Department of Employee: "+department);
        System.out.println("Specialization of Employee: "+specialization);
    }
}
