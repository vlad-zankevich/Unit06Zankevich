package com.epam.unit06.task03;

import java.util.ArrayList;
import java.util.List;

public class TestBook {

    public static void main(String[] args) {

        Library library = new Library();

        library.addBook(new Book(1234234, "Way Station", "Clifford Simak", "Test", 1963,
            155,50, "Solid"));

        library.addBook(new Book(221334234, "City", "Clifford Simak", "Test", 1952, 122,
            200, "Soft"));

        library.addBook(new Book(32342874, "The Other Wind", "Ursula Le Guin", "Test", 2001,
            212,390, "Solid"));

        library.addBook(new Book(34634, "Rocannon's World", "Ursula Le Guin", "Test", 1966,
            212,390, "Solid"));

        library.addBook(new Book(95234, "Time and Again", "Clifford Simak", "Test", 1951,
            222,200, "Soft"));

        library.addBook(new Book(77234, "The Puppet Masters", "Robert A. Heinlein", "Test",
            1951, 222,200, "Soft"));


        String author = "Clifford Simak";
        List<Book> arrayList = new ArrayList<Book>();
        arrayList = library.getBooksFromAuthor(author);
        System.out.println();
        System.out.println(arrayList.toString());

        String year = "Clifford Simak";
        List<Book> arrayList2 = new ArrayList<Book>();
        arrayList2 = library.getBooksAfterYear(1951);
        System.out.println();
        System.out.println(arrayList2.toString());
    }
}
