package appsoft_assignment_3.com;

import appsoft_assignment_3.com.encapsulation.Manager;
import appsoft_assignment_3.com.example.domain.Admin;
import appsoft_assignment_3.com.example.domain.Director;
import appsoft_assignment_3.com.example.domain.Engineer;

import java.util.Scanner;

public class EmployeeTest {

    public static void main(String[] args) {
        //For Engineer
        Engineer engineer = new Engineer("Jana Smith", 120345.27, "012-34-5678", 101);

        //for Manager
        Manager manager = new Manager("barbara Johnson", 109501.36,
                "054-12-2367", 207, "Us Marketing");

        //For Admin
        Admin admin=new Admin("Bill Munroe",75002.34,"108-23-6509",304);

        //For Director
        Director director=new Director("Susan Wheeler",120567.36,
                "099-45-2340",12,"Global Marketing ",1000000);

        //display engineer
        engineer.print();

        //display manager
        manager.print();

        //display admin
        admin.print();

        //display director
        director.print();


        //for rise salary of Engineer ("Jana Smith", 120345.27, "012-34-5678", 101)
       Validation validation=new Validation();
       validation.setNameValidation(engineer);//name : lara bell
      validation.riseSalaryValidation(engineer); //rise 10000;
        //After rise and set name:  {empId=101, name='lara Bell', ssn='012-34-5678', salary=$130,345.27}
        engineer.print();

    }
}
