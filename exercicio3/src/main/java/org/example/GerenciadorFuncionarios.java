package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class GerenciadorFuncionarios {

    private HashMap<Funcionario, ArrayList<Double>> arrayHashMap = new HashMap<>();

    public void adicionarFuncionario(Funcionario funcionario, ArrayList<Double> valores) {
        this.arrayHashMap.put(funcionario, valores);
    }

    public void removerFuncionario(Funcionario funcionario) {
        this.arrayHashMap.remove(funcionario);
    }

    public void exibirFuncionarios() {
        arrayHashMap.forEach((func, valores) -> {
            System.out.println("Funcionário: " + func.getNome() + " | Valores: " + valores);
        });
    }

}


