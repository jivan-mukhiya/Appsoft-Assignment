package appsoft_assignment_3.inheritance;

public class Qn3_Main {

    public static void main(String[] args) {

        //for Employee
        Qn3_Employee emp = new Qn3_Employee();

        System.out.println("Employee Details !!");
        emp.name="sagar dhakal";
        emp.age=40;
        emp.salary=50000;
        emp.address="kathmandu";
        emp.phoneNumber="99863636637";
        emp.department="Engineering";
        emp.specialization="Java Spring Api";

        emp.displayEmployee();
        emp.printSalary();

        //for manager
        Qn3_Manager mgr = new Qn3_Manager();
        System.out.println("Manager Details !!");

        mgr.name="Anil kunwar";
        mgr.age=45;
        mgr.salary=70000;
        mgr.address="kathmandu";
        mgr.phoneNumber="9873663633";
        mgr.department="Marketing";
        mgr.specialization="E-Marketing";

        mgr.displayManager();
        mgr.printSalary();
    }
}
