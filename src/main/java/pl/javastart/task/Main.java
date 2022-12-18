package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();

        while (library.stop) {
            library.add();
        }

        System.out.println("Obiekty zapisane w tablicy");
        System.out.println(library);

    }
}
