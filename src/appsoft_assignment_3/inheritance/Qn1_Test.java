package appsoft_assignment_3.inheritance;

public class Qn1_Test {

    public static void main(String[] args) {

        //object of parent class
        Qn1_ParentClass qn1ParentClass=new  Qn1_ParentClass();

        //object of child class
        Qn1_childClass qn1ChildClass=new Qn1_childClass();

        //method of parent class by object of parent class
        qn1ParentClass.print();

        //method of child class by object of child class
        qn1ChildClass.print();

        //method of parent class by object of child class
        qn1ChildClass.print();
    }
}
