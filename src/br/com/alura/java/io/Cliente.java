package br.com.alura.java.io;

import java.io.Serializable;

public class Cliente implements Serializable {

    private static final long serialVersionUID = -1446376317531071601L;

    private String nome;
    private String cpf;
    private String profissao;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeECpf() {
        return nome + ", " + cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getProfissao() {
        return profissao;
    }
}
