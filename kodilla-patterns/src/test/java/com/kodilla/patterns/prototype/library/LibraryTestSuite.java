package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Book book1 = new Book("Trip-1", "Author-1", LocalDate.of(1991,1,1));
        Book book2 = new Book("Trip-2", "Author-2", LocalDate.of(1992,1,1 ));
        Book book3 = new Book("Trip-3", "Author-3", LocalDate.of(1993,1,1 ));
        Book book4 = new Book("Trip-4", "Author-4", LocalDate.of(1994,1,1 ));
        Book book5 = new Book("Trip-5", "Author-5", LocalDate.of(1995,1,1));

        Library library = new Library("Libra-1");

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        library.getBooks().add(book5);

        System.out.println("Before removing a book the library has " + library.getBooks().size() + " books.\n" +
                library.toString());

        //making a shallow clone of object library
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Cloned Libra-1");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Deep cloned Libra-1");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book3);

        //Then
        System.out.println("After removing a book the library has " + library.getBooks().size() +
                " books.");
        System.out.println(library.toString());
        System.out.println(clonedLibrary.toString());
        System.out.println(deepClonedLibrary.toString());
        Assert.assertEquals(4, library.getBooks().size());
        Assert.assertEquals(4, clonedLibrary.getBooks().size());
        Assert.assertEquals(5, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
