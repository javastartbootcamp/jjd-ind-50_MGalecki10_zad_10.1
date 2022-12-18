package pl.javastart.task;

import java.util.Arrays;
import java.util.Scanner;

public class Library {
    static final int MAX_BOOKS = 3;
    boolean stop = true;
    Scanner input = new Scanner(System.in);

    private Book[] books = new Book[MAX_BOOKS];
    private int booksNumber = 0;

    void add(Book book) {
        if (booksNumber < MAX_BOOKS) {
            if (!isDuplicate(book, books, booksNumber)) {
                books[booksNumber] = book;
                booksNumber++;
            } else {
                System.out.println("Duplikat");
                booksNumber--;
            }
        } else {
            System.out.println("Nie można dodać więcej książek");
            stop = false;
        }
    }

    Book createBook() {
        System.out.println("Podaj tytuł");
        String title = input.nextLine();
        System.out.println("Podaj rok");
        int year = input.nextInt();
        input.nextLine();
        System.out.println("Podaj ilość stron");
        int pages = input.nextInt();
        input.nextLine();
        return new Book(title, year, pages);
    }

    boolean isDuplicate(Book book, Book[] books, int i) {
        if (book.equals(books[i])) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        for (Book book : books) {
            return book.toString();
        }
        return null;
    }
}
