package appsoft_assignment_3.inheritance;

import java.util.Scanner;

public class Qn5_Print_10_Square {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Qn4_Square[] square=new Qn4_Square[10];
        for(int i=0;i<square.length;i++){
            System.out.println("Enter Value !!");
            System.out.println("=============================================");
            System.out.println("Enter Length :");
            int length=scanner.nextInt();
            System.out.println("Enter breadth :");
            int breadth=scanner.nextInt();
            square[i]=new Qn4_Square(length,breadth);
        }

        for(Qn4_Square square1:square){
            square1.getArea();
            square1.getParameter();
        }

    }

}
