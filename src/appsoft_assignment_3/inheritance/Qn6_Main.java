package appsoft_assignment_3.inheritance;

public class Qn6_Main {

    public static void main(String[] args) {

        //for Rectangle Class
        Qn6_Rectangle qn6Rectangle=new Qn6_Rectangle();
        qn6Rectangle.message();


        //for Circle Class
        Qn6_Circle  qn6Circle=new Qn6_Circle();
        qn6Circle.message();

        //for Sub class of Rectangle (i.e square)
        Qn6_Square qn6Square=new Qn6_Square();
        qn6Square.message();
    }
}
