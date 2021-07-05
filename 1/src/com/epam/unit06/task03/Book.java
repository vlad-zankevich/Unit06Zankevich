package com.epam.unit06.task03;

import java.util.Random;

public class Book {

    private int id;
    private String name;
    private String author;
    private String publisher;
    private int year;
    private int pageQuantity;
    private int price;
    private String typeOfBinding;

    public Book() {

        Random random = new Random();
        int n = random.nextInt(100000);
        id = n;
        name = "A Book";
        author = "An Author";
        publisher = "Any Publisher";
        year = 1900;
        pageQuantity = 100;
        price = 200;
        typeOfBinding = "Soft";

    }

    public Book(int id, String name, String author, String publisher, int year, int pageQuantity,
                int price, String typeOfBinding) {

        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;

        if (year < 1500 || year > 2050) {
            throw new RuntimeException("The Book year can be from 1500 to 2050");
        } else {
            this.year = year;
        }

        if (pageQuantity <= 0) {
            throw new RuntimeException("Page quantity couldn't be less then 1");
        } else {
            this.pageQuantity = pageQuantity;
        }

        if (price < 0) {
            throw new RuntimeException("Price can't be less 0");
        } else {
            this.price = price;
        }

        this.typeOfBinding = typeOfBinding;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setYear(int year) {
        if (year < 1500 || year > 2050) {
            throw new RuntimeException("The Book year can be from 1500 to 2050");
        } else {
            this.year = year;
        }
    }

    public void setPageQuantity(int pageQuantity) {
        if (pageQuantity <= 0) {
            throw new RuntimeException("Page quantity couldn't be less then 1");
        } else {
            this.pageQuantity = pageQuantity;
        }
    }

    public void setPrice(int price) {
        if (price < 0) {
            throw new RuntimeException("Price can't be less 0");
        } else {
            this.price = price;
        }
    }

    public void setTypeOfBinding(String typeOfBinding) {
        this.typeOfBinding = typeOfBinding;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    public int getPageQuantity() {
        return pageQuantity;
    }

    public int getPrice() {
        return price;
    }

    public String getTypeOfBinding() {
        return typeOfBinding;
    }

    @Override
    public String toString() {
        return ("Book ID = " + id + ", name = " + name + ", author = " + author + ", publisher = " + publisher + ", Year = "
            + year + ", pageQuantity = " + pageQuantity + ", price = " + price + ", typeOfBinding = " + typeOfBinding + "\n");
    }
}
