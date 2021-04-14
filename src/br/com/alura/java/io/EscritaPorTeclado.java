package br.com.alura.java.io;

import java.io.*;

public class EscritaPorTeclado {

    public static void main(String[] args) throws IOException {

        InputStream file = System.in;
        Reader reader = new InputStreamReader(file);
        BufferedReader bufferedReader = new BufferedReader(reader);

        OutputStream outputStream = new FileOutputStream("escritaPorTeclado.txt");
        Writer writer = new OutputStreamWriter(outputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        String linha = bufferedReader.readLine();
        while(linha != null && !linha.isEmpty()){
            bufferedWriter.write(linha);
            bufferedWriter.newLine();
            linha = bufferedReader.readLine();
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
