package br.com.alura.java.io;

import java.io.*;

public class SerializacaoCliente {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        Cliente cliente = new Cliente();
//        cliente.setNome("Gabriel Moura");
//        cliente.setCpf("43936285861");
//        cliente.setProfissao("Desenvolvedor");

//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//        objectOutputStream.writeObject(cliente);
//        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("cliente.bin"));
        Cliente cliente = (Cliente) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(cliente.getNomeECpf());
    }
}
