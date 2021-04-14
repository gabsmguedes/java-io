package br.com.alura.java.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscritaComFileWriter {

    public static void main(String[] args) throws IOException {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("escrita.txt"));

        bufferedWriter.write("Escrevendo JOOJ");
        bufferedWriter.write(System.lineSeparator());
        bufferedWriter.write("Escrevendo JOOJ2");
        bufferedWriter.close();
    }

}
