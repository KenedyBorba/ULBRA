package com.company;

import java.util.Scanner;

public class exe06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int resistencia = 0, maior = 0, menor = 0, soma = 0;

        for (int i = 0; i < 4; i++) {

            System.out.println("Insira um valor:");
            resistencia = input.nextInt();

            if (i == 0) {

                maior = resistencia;
                menor = resistencia;
            }

            if (resistencia > maior) {

                maior = resistencia;
            }

            if (resistencia < menor) {

                menor = resistencia;
            }

            soma = soma + resistencia;
        }

        System.out.println("Resistência equivalente: " + soma);
        System.out.println("Maior resistência: " + maior + ". Menor resistência: " + menor);
    }


}

