package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        do {
            System.out.println(">>| Gerenciamento de Funcionários <<|\n\n");

            System.out.println("1. Adicionar funcionários");
            System.out.println("2.Remover funcionários pelo ID\n");
            System.out.println("3. Exibir todos os funcionários cadastrados");
            System.out.println("0. SAIR");

            System.out.println();
            System.out.print("Digite a opção escolhida:>>\t");
            double opcao = input.nextDouble();
            try {

                option = input.nextInt();
                // Skip the newline character
                input.skip("\\R"); // \\R matches any Unicode newline sequence

                switch (option) {

                    case 1:
                        System.out.println();
                        System.out.println("Adicionar novo idFuncionario");
                        System.out.print("\n\tTítulo: ");
                        idFuncionario = input.nextLine();
                        System.out.print("\n\t Funcionario: ");
                        funcionario = input.nextLine();
                        System.out.print("\n\tsalario do funcionario: ");
                        salario = input.nextDouble();
                        Funcionario novoFuncionario = new Funcionario();
                        novoFuncionario.adicionarFuncionario(new Funcionario(idFuncionario, funcionario, salario));
                        System.out.println();
                        break;

                    case 2:
                        System.out.println("Remover música pelo título");
                        System.out.print("\tInforme o título: ");
                        titulo = input.nextLine();
                        System.out.println();
                        playList.removerMusica(titulo);
                        break;

                    case 3:
                        Musica[] musicas = playList.listarMusicas();

                        if (musicas != null) {
                            System.out.println("Lista de músicas:");
                            for (Musica musicaLocal : musicas) {
                                System.out.println("\t" + musicaLocal.toString());
                            }
                        } else {
                            System.out.println("A lista está vazia!!");
                        }
                        break;

                    case 4:
                        System.out.println("Duração total: " + playList.duracaoTotal() + "minutos");
                        break;
                    case 0:
                        System.out.println("Até mais!!");
                        break;

                    default:
                        System.out.println("Opção inválida, tente novamente");
                        option = 99;
                        break;


                }
            } catch (InputMismatchException e) {
                System.out.println("O valor informado é inválido, você deve fornecer valores numéricos.");
                System.out.println("Tente novamente");
                option = 0;
            }


        } while (option != 0);
    }
}

    }
            }
