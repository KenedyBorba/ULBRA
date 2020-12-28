package com.company;

import java.util.Scanner;

public class exe04 {

    public static void main(String[] args) {

        int idade;
        int qtdAnos;
        char sexo;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite a idade");
        idade = input.nextInt();
        System.out.println("A quantidade de anos");
        qtdAnos = input.nextInt();
        System.out.println("Digite o sexo");
        sexo = input.next().charAt(0);

        if (sexo == 'f') {
            if ((idade < 60 ) || (qtdAnos>=30)) {
                int anosAposentar = 30 - qtdAnos;
                if (anosAposentar <= 0) {
                    System.out.println("Você já pode se aposentar pelo tempo de contribuição");
                } else {
                    System.out.println("Falta " + anosAposentar + "para você se aposentar");
                }
            } else {
                    System.out.println("Você já pode se aposentar pelo fator idade");
                }
            } else {
                if ((idade < 65) || (qtdAnos>=35)) {
                    int anosAposentar = 35 - qtdAnos;
                    if (anosAposentar <= 0) {
                        System.out.println("Você já pode se aposentar pelo tempo de contribuição");
                    } else {
                        System.out.println("Falta " + anosAposentar + " para você se aposentar");
                    }
                } else {
                    System.out.println("Você já pode se aposentar pelo fator de idade");
                }
            }
        }
    }
