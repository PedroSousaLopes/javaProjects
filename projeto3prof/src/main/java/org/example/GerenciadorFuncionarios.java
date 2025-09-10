package org.example;

import org.example.Funcionario;

import java.util.HashMap;

public class GerenciadorFuncionarios {
    private static HashMap<Integer, Funcionario> funcionarios = new HashMap<>();

    public static void adicionarFuncionario(int id, String nome, double salario) {
        if (funcionarios.containsKey(id)) {
            System.out.println("Erro: Funcionário com ID " + id + " já existe!");
        } else {
            Funcionario f = new Funcionario(id, nome, salario);
            funcionarios.put(id, f);
            System.out.println("Funcionário adicionado com sucesso!");
        }
    }

    public static void exibirFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
        } else {
            System.out.println("Lista de Funcionários:");
            for (Funcionario f : funcionarios.values()) {
                System.out.println(f);
            }
        }
    }

    public static void removerFuncionario(int id) {
        if (funcionarios.containsKey(id)) {
            funcionarios.remove(id);
            System.out.println("Funcionário removido com sucesso!");
        } else {
            System.out.println("Funcionário com ID " + id + " não encontrado.");
        }
    }
}
