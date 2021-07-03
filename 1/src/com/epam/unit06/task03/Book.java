package com.epam.unit06.task03;

public class Book {

    private String name;
    private String author;
    private String genre;
    private int year;
    private int pageQuantity;

    public Book() {
        name = "A Book";
        author = "An Author";
        genre = "Any Genre";
        year = 1900;
        pageQuantity = 100;
    }

    public Book (String name, String author, String genre, int year, int pageQuantity) {

        this.name = name;
        this.author = author;
        this.genre = genre;

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
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPageQuantity(int pageQuantity) {
        this.pageQuantity = pageQuantity;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public int getPageQuantity() {
        return pageQuantity;
    }

    public void addBookToLibrary() {
        
    }
}
