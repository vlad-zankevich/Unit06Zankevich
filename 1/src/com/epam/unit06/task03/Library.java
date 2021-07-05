package com.epam.unit06.task03;

import java.util.ArrayList;

import java.util.List;

public class Library {

    private List <Book> bookList;

    public Library() {
        bookList = new ArrayList<Book>();
    }

    public List <Book> getBooksFromAuthor(String author) {
        List <Book> byAuthor = new ArrayList<Book>();

        for (Book book : bookList) {
            if (book.getAuthor().equals(author)) {
                byAuthor.add(book);
            }
        }
        return byAuthor;
    }

    public List <Book> getBooksAfterYear(int year) {
        List<Book> byYear = new ArrayList<Book>();

        for (Book book : bookList) {
            if (book.getYear() > year) {
                byYear.add(book);
            }
        }
        return byYear;
    }

    public List <Book> getBooks() {
        return bookList;
    }

    public void setBooks(List <Book> bookList) {
        this.bookList = bookList;
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    @Override
    public String toString() {
        return "Found books" + bookList;
    }

}
