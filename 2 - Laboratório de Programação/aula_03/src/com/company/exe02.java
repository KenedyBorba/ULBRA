package com.company;

import javax.swing.*;

public class exe02 {

    public static void main(String[] args) {

        float valorN, valorV, percentual, valorImposto;

        valorV = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da venal"));
        valorN = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da tra nsação:"));
        percentual = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da percentual:"));

        if (valorV >= valorN) {
            valorImposto = valorV * percentual / 100;
        } else {
            valorImposto = valorN * percentual / 100;
        }
        JOptionPane.showMessageDialog(null, "O valor a ser pago é: " + valorImposto);
    }
}
