package Bai1;

public class Book {
    private int id;
    private String name;
    private String type;
    private String author;
    private int year;
    private int number;

    public Book(int id, String type, String name, String author, int year, int number) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.author = author;
        this.year = year;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public String getBookType() {
        return type;
    }

    public String getBookName() {
        return name;
    }

    public String getAuthorName() {
        return author;
    }

    public int getPublicYear() {
        return year;
    }

    public int getPageNumber() {
        return number;
    }

    public float getQuantity() {
        return id + 1;
    }

    public String toString() {
        return id + " " + type + " " + name + " " + author + " " + year + " " + number + "\n";
    }
}
