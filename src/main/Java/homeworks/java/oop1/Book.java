package homeworks.java.oop1;

public class Book {
    private String name;
    private int year;
    private Author author;
    private double price;

    //constructor
    public Book(String name, int year, Author author, double price) {
        this.name = name;
        this.year = year;
        this.author = author;
        this.price = price;
    }

    //get
    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public String scriecarte() {
        return ("Book1: " + name + "( " + price + " RON) by " + author.scrieautor() + ", published in the year " + year+".");
    }
}