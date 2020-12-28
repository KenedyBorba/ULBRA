package com.company;

import javax.swing.*;

public class exe03 {

    public static void main(String[] args) {
        double n1, n2, t1, media;

        n1 = Double.parseDouble(JOptionPane.showInputDialog("Primeira nota:"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Segunda nota:"));
        t1 = Double.parseDouble(JOptionPane.showInputDialog("Nota do trabalho:"));
        media = (n1 + n2 + t1) / 3;
        if (media >= 6) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }
    }
}
