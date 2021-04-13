package br.com.alura.java.io;

import java.io.*;

public class Leitura {

    public static void main(String[] args) throws IOException {

        FileInputStream file = new FileInputStream("leitura.txt");
        InputStreamReader reader = new InputStreamReader(file);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String linha = bufferedReader.readLine();
        System.out.println(linha);
        bufferedReader.close();
    }
}
