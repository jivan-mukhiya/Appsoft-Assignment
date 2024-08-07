package com.assignment_1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BookExecutor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BookIo bookIo=new BookIo();
        BookServices bookServices = new BookServices();

        System.out.println("Enter the books do you want to add :");
        int size =scanner.nextInt();
        Book[] books =new Book[size];
        for (int i = 0; i < size; i++) {
           books[i]= bookIo.readBook();
        }

        boolean status=true;

        while(status){

            System.out.println("==========WELCOME TO BOOK STORE================");
            System.out.println("Please Enter your choice !");
            System.out.println("1. View Book List");
            System.out.println("2. Book Stock Details");
            System.out.println("3. Exist");
            int choice=scanner.nextInt();

            switch (choice){
                case 1:
                   bookIo.bookListDisplay(books);
                    break;

                case 2:
                   bookIo.bookStockDisplay(bookServices.totalBooks(books),
                           bookServices.totalCostOfBooks(books),
                           bookServices.maximumCostOfBooks(books),
                           bookServices.minimumCostOfBooks(books),
                           bookServices.averageCostOfBooks(books));
                    break;
                case 3:
                    System.out.println("Thank you for using Book Store");
                    status=false;
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        }
    }
}
