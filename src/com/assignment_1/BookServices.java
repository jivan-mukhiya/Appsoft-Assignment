package com.assignment_1;

public class BookServices {

    public int totalBooks(Book[] books){

        return books.length;
    }

    public double totalCostOfBooks(Book[] books){

        double total=0;
        for(Book book:books){
            total+=book.getPrice();
        }

        return total;
    }

    public double maximumCostOfBooks(Book[] books){

        double maximum=0;
        for(Book book:books) {
            if (book.getPrice() >= maximum) {
                maximum = book.getPrice();
            }
        }
        return maximum;

    }

    public  double minimumCostOfBooks(Book[] books){

        double minimum=books[0].getPrice();
        for(Book book:books) {

            if (minimum>=book.getPrice()) {
                minimum = book.getPrice();
            }
        }
        return minimum;
    }

    public double averageCostOfBooks(Book[] books){

        double total=0;
        for(Book book:books) {
            total += book.getPrice();
        }
        return total/books.length;
    }

}
