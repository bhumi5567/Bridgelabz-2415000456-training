package com.bridgelabz.oops.levelone;

class Book {
    String title = "Java Basics";
    String author = "John Doe";
    double price = 399.99;

    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Book book = new Book();
        book.displayDetails();
    }
}
