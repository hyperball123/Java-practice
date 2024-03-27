package collections;

import java.util.ArrayList;

//Arraylist example
class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
class BookstoreInventory {
    public static void main(String[] args) {
        ArrayList<Book> inventory = new ArrayList<>();

        // Adding books to inventory
        inventory.add(new Book("Java Programming", "John Doe", 29.99));
        inventory.add(new Book("Python Basics", "Alice Smith", 19.99));
        inventory.add(new Book("Data Structures and Algorithms", "Bob Johnson", 39.99));

        // Accessing books in inventory
        for (Book book : inventory) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Price: $" + book.getPrice());
        }
    }
}
