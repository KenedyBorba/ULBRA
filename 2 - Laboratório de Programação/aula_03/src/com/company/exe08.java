package com.company;

import java.util.Scanner;

public class exe08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x, num;

        System.out.println("Digite um número: ");
        num = input.nextInt();

        for (x = 0; x <= 10; x++) {
            System.out.println("" + num + "x " + x + "= " + (x * num));
        }
    }
}
