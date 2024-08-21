package appsoft_assignment_3.com;

import appsoft_assignment_3.com.encapsulation.Employee;

import java.util.Scanner;

public class Validation {
    private Scanner scanner=new Scanner(System.in);

    //Validation Salary
    public void riseSalaryValidation(Employee employee){
        System.out.println("Rise Salary :");
        double riseSalary=scanner.nextDouble();
        if(riseSalary>0){
            employee.riseSalary(riseSalary);
        }else {
            System.out.println("Invalid Rise Salary !!");
        }
    }

    //Validation Name
    public void setNameValidation(Employee employee){
        System.out.println("Enter the name :");
        String name=scanner.nextLine();
        if(name.isEmpty()){
            System.out.println("Invalid Name !!");
        }
        employee.setName(name);
    }

}
