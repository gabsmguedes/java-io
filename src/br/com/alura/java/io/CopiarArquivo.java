package br.com.alura.java.io;

import java.io.*;

public class CopiarArquivo {

    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("leitura.txt");
        Reader reader = new InputStreamReader(file);
        BufferedReader bufferedReader = new BufferedReader(reader);

        OutputStream outputStream = new FileOutputStream("copiaArquivo.txt");
        Writer writer = new OutputStreamWriter(outputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        String linha = bufferedReader.readLine();
        while(linha != null ){
            bufferedWriter.write(linha);
            bufferedWriter.newLine();
            linha = bufferedReader.readLine();
        }
        bufferedReader.close();
        bufferedWriter.close();

    }
}
