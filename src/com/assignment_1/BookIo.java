package com.assignment_1;

import java.util.Scanner;

public class BookIo {
    private Scanner scanner=new Scanner(System.in);

    public Book readBook(){

        System.out.println("Enter Book Title: ");
        String title=scanner.nextLine();

        System.out.println("Enter Book Author: ");
        String author=scanner.nextLine();

        System.out.println("Enter Book price: ");
        double price=scanner.nextDouble();

        scanner.nextLine();
        System.out.println("Enter Book publisher: ");
        String publisher=scanner.nextLine();

        System.out.println("Enter Book ISBN: ");
        String isbn=scanner.nextLine();


        return new Book(title,author,price,publisher,isbn);
    }


    public void bookListDisplay(Book[] bookList){

        System.out.print("    "+"Title"+"    ");
        System.out.print("    "+"Author"+"    ");
        System.out.print("    "+"Price"+"    ");
        System.out.print("    "+"Publisher"+"    ");
        System.out.print("  "+"ISBN"+"    \n");
        System.out.print("   "+"========"+"  ");
        System.out.print("   "+"========"+"  ");
        System.out.print("   "+"========"+"  ");
        System.out.print("   "+"========"+"  ");
        System.out.print("      "+"========"+"    \n");
        for(Book book:bookList){

            System.out.print("    "+"£"+book.getTitle()+"    ");
            System.out.print("    "+"£"+book.getAuthor()+"    ");
            System.out.print("    "+"£"+book.getPrice()+"    ");
            System.out.print("    "+"£"+book.getPublisher()+"    ");
            System.out.print("       "+"£"+book.getISBN() +"    \n");

        }

    }

    public void bookStockDisplay(int totalBooks,double totalCost,double maximum,double minimum,double average){

        System.out.println("========Totals Stocks===========");

        System.out.println("Total number of books: "+"£"+totalBooks);
        System.out.println("Total cost of books: "+"£"+totalCost);
        System.out.println("Maximum cost of a book: "+"£"+maximum);
        System.out.println("Minimum cost of book: "+"£"+minimum);
        System.out.println("+Average cost of book: "+"£"+average);
    }


}
