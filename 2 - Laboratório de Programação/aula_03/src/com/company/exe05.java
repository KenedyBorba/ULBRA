package com.company;

import java.io.PrintStream;
import java.util.Scanner;

public class exe05 {

    public static void main(String[] args) {

        String nome;
        float valor;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do produto");
        nome = input.next();
        System.out.println("Digite o valor do produto");
        valor = input.nextFloat();

        if ((valor >= 50) && (valor < 200)) {
            float valorDesconto = (float) ( valor - (valor * 0.05));
            System.out.println("O produto " + nome + ", tem o valor de R$" + valor + ", com desconto fica R$" + valorDesconto);
        }
        if ((valor >= 200) && (valor < 500)) {
            float valorDesconto = (float) ( valor - (valor * 0.06));
            System.out.println("O produto " + nome + ", tem o valor de R$" + valor + ", com desconto fica R$" + valorDesconto);
        }
        if ((valor >= 500) && (valor < 1000)) {
            float valorDesconto = (float) ( valor - (valor * 0.07));
            System.out.println("O produto " + nome + ", tem o valor de R$" + valor + ", com desconto fica R$" + valorDesconto);
        }
        if (valor >= 1000) {
            float valorDesconto = (float) ( valor - (valor * 0.08));
            System.out.println("O produto " + nome + ", tem o valor de R$" + valor + ", com desconto fica R$" + valorDesconto);
        }
        if (valor == 0) {
            System.out.println("Valor Inválido");
        }


    }
}
