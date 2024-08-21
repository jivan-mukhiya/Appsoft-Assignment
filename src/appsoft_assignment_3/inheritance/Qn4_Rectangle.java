package appsoft_assignment_3.inheritance;

public class Qn4_Rectangle {
    int length;
    int breadth;

    public Qn4_Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }


    void getArea(){

        int area = length * breadth;
        System.out.println("Area of Rectangle is: " + area);
    }

    void getParameter(){

        int parameter = 2*(length + breadth);
        System.out.println("Parameter of Rectangle is: " + parameter);
    }
}
