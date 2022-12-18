package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();

        do {
            library.add(library.createBook());
        } while (library.stop);

        System.out.println("Obiekty zapisane w tablicy");

    }
}
