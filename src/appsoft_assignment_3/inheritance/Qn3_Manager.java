package appsoft_assignment_3.inheritance;

public class Qn3_Manager extends Qn3_Member{

    String specialization;
    String department;

    void displayManager(){
        System.out.println("Name of manager: "+name);
        System.out.println("Age of manager: "+age);
        System.out.println("Phone Number of manager: "+phoneNumber);
        System.out.println("Address of manager: "+address);
        System.out.println("Department of manager: "+department);
        System.out.println("Specialization of manager: "+specialization);
    }

}
