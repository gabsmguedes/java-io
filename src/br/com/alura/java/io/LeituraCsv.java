package br.com.alura.java.io;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class LeituraCsv {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("encoding.csv"), StandardCharsets.UTF_8);

        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            System.out.println(nextLine);

            Scanner linhaScanner = new Scanner(nextLine);
            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(",");
            String tipoConta = linhaScanner.next();
            int agencia = linhaScanner.nextInt();
            int numero = linhaScanner.nextInt();
            String titular = linhaScanner.next();
            double saldo = linhaScanner.nextDouble();

            System.out.format(new Locale("pt", "BR"), "%s - %04d-%08d, %20s:  %08.2f %n",
                    tipoConta, agencia, numero, titular, saldo);
            linhaScanner.close();
        }
        scanner.close();
    }
}
