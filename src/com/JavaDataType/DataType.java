package com.JavaDataType;

public class DataType {
    public static void main(String[] args) {

        //Java data types,size, range(max_value,min_value)
        System.out.println("--------------------------------------------------------------------------------");
        System.out.print("|  S.N    |");
        System.out.print("  Data Type   |") ;
        System.out.print("  Size   |") ;
        System.out.print("     Min_Value     |");
        System.out.println("     Max_Value    |");

        //for byte
        System.out.println("-----------------------------------------------------------------------------");
        System.out.print("|  1      |");
        System.out.print("    byte      |") ;
        System.out.print("    "+Byte.SIZE+"    |");
        System.out.print("       "+Byte.MIN_VALUE+"        |");
        System.out.println("       "+Byte.MAX_VALUE+"        |");

        //for short
        System.out.println("----------------------------------------------------------------------------");
        System.out.print("|  1      |");
        System.out.print("   short     |") ;
        System.out.print("    "+Short.SIZE+"    |");
        System.out.print("       "+Short.MIN_VALUE+"      |");
        System.out.println("      "+Short.MAX_VALUE+"       |");

        //for int
        System.out.println("----------------------------------------------------------------------------------");
        System.out.print("|  1      |");
        System.out.print("     int     |") ;
        System.out.print("   "+Integer.SIZE+"     |");
        System.out.print("     "+Integer.MIN_VALUE+"   |");
        System.out.println("    "+Integer.MAX_VALUE+"    |");


        //for long
        System.out.println("--------------------------------------------------------------------------------");
        System.out.print("|  1      |");
        System.out.print("    long     |") ;
        System.out.print("    "+Long.SIZE+"    |");
        System.out.print("  "+Long.MIN_VALUE+"  |");
        System.out.println(" "+Long.MAX_VALUE+"  |");

        //for float
        System.out.println("------------------------------------------------------------------------------------");
        System.out.print("|  1      |");
        System.out.print("   float     |") ;
        System.out.print("    "+Float.SIZE+"    |");
        System.out.print("    "+Float.MIN_VALUE+"    |");
        System.out.println("   "+Float.MAX_VALUE+"   |");

        //for double
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.print("|  1      |");
        System.out.print("   double     |") ;
        System.out.print("    "+Double.SIZE+"    |");
        System.out.print("    "+Double.MIN_VALUE+"    |");
        System.out.println(" "+Double.MAX_VALUE+"   |");


        //for char
        System.out.println("----------------------------------------------------------------------------------");
        System.out.print("|  1      |");
        System.out.print("     char     |") ;
        System.out.print("       "+Character.SIZE+"    |");
        System.out.print("       "+Character.MIN_VALUE+"       |");
        System.out.println("         "+Character.MAX_VALUE+"            |");


        //for boolean
        System.out.println("----------------------------------------------------------------------------------");
        System.out.print("|  1      |");
        System.out.print("     boolean     |") ;
        System.out.print("        No Size     |");
        System.out.print("     Null     |");
        System.out.println("     Null     |");



    }
}
