package pl.javastart.task;

import java.util.Arrays;
import java.util.Scanner;

public class Library {
    private static final int MAX_BOOKS = 3;
    boolean stop = true;
    Scanner input = new Scanner(System.in);

    private Book[] books = new Book[MAX_BOOKS];
    private int booksNumber = 0;

    void add() {
        if (booksNumber < MAX_BOOKS) {
            Book book = createBook();
            if (!isDuplicate(books, book)) {
                books[booksNumber] = book;
                booksNumber++;
            } else {
                System.out.println("Duplikat");
            }
        } else {
            System.out.println("Nie można dodać więcej książek");
            stop = false;
        }
    }

    private Book createBook() {
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

    boolean isDuplicate(Book[] books, Book book) {
        for (int i = 0; i < books.length; i++) {
            if (book.equals(books[i])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String info = "";
        for (Book book : books) {
            info += book.toString();
        }
        return info;
    }
}
