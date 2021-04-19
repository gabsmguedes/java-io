package br.com.alura.java.io;

import java.io.*;

public class Serializacao {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        String nome = "Gabriel Moura";
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
//        objectOutputStream.writeObject(nome);
//        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("objeto.bin"));
        String nome =(String) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(nome);
    }
}
