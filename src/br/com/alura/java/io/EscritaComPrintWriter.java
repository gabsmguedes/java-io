package br.com.alura.java.io;

import java.io.IOException;
import java.io.PrintWriter;

public class EscritaComPrintWriter {

    public static void main(String[] args) throws IOException {

        PrintWriter printWriter = new PrintWriter("escrita.txt");

        printWriter.println("Escrevendo JOOJ");
        printWriter.println();
        printWriter.println("Escrevendo JOOJ2");
        printWriter.close();
    }

}
