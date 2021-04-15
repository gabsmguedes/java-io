package br.com.alura.java.io;

import java.io.File;
import java.util.Scanner;

public class LeituraCsv {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("contas.csv"));

        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            System.out.println(nextLine);
        }
        scanner.close();
    }
}
