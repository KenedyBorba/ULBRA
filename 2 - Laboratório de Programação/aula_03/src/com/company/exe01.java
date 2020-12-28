package com.company;

import java.util.Scanner;

public class exe01 {

    public static void main(String[] args) {
        float valor, desconto, valorDesconto;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do produto");//escreva
        valor = input.nextFloat();//leiaUmFloat
        System.out.println("Digite o valor do desconto");//escreva
        desconto = input.nextFloat();//leiaUmFloat
        valorDesconto = valor * (desconto / 100);
        System.out.println("O valor do desconto é: " + valorDesconto);
        System.out.printf("O valor do produto é: " + (valor - valorDesconto) + "%n", "%.2f");

    }
}
