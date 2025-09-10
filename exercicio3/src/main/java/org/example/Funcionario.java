package org.example;

public class Funcionario {

    Integer idFuncionario;
    String nome;
    String salario;


    public Funcionario() {

    }

    public Funcionario(Integer idFuncionario, String salario, String nome) {
        this.idFuncionario = idFuncionario;
        this.salario = salario;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getSalario() {
        return salario;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Funcionario{" +
                "idFuncionario=" + idFuncionario +
                ", nome='" + nome + '\'' +
                ", salario='" + salario + '\'' +
                '}';
    }
}
