package br.com.alura.java.io;

import java.io.*;

public class Escrita {

    public static void main(String[] args) throws IOException {
        OutputStream outputStream = new FileOutputStream("escrita.txt");
        Writer writer = new OutputStreamWriter(outputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.write("Escrevendo JOOJ");
        bufferedWriter.newLine();
        bufferedWriter.write("Escrevendo JOOJ2");
        bufferedWriter.close();
    }
}
