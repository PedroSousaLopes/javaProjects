package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\n=== GERENCIADOR DE FUNCIONÁRIOS ===");
            System.out.println("1 - Adicionar Funcionário");
            System.out.println("2 - Remover Funcionário");
            System.out.println("3 - Exibir Funcionários");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = input.nextInt();
            input.nextLine(); // limpar buffer

            switch (opcao) {
                case 1 -> {
                    System.out.print("ID: ");
                    int id = input.nextInt();
                    input.nextLine(); // limpar buffer
                    System.out.print("Nome: ");
                    String nome = input.nextLine();
                    System.out.print("Salário: ");
                    double salario = input.nextDouble();
                    GerenciadorFuncionarios.adicionarFuncionario(id, nome, salario);
                }
                case 2 -> {
                    System.out.print("ID do funcionário a remover: ");
                    int id = input.nextInt();
                    GerenciadorFuncionarios.removerFuncionario(id);
                }
                case 3 -> GerenciadorFuncionarios.exibirFuncionarios();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}
