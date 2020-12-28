import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Teclado tc = new Teclado();

        String string = tc.lerString();
        System.out.println("String: " + string);

        int num = tc.lerInt();
        System.out.println("Inteiro: " + num);

        double oDouble = tc.lerDouble();
        System.out.println("Double: " + oDouble);

        double valor = tc.lerDouble("\nDigite um preço:");
        System.out.println("Valor: " + valor);

        float flo = tc.lerFloat();
        System.out.println("Float: " + flo);

        char ler = tc.lerChar();
        System.out.println("Char: " + ler);

        String fone = tc.lerFone("\nDigite o número de telefone no formato DDD-XXXXXXXXX:");
        System.out.println("Número: " + fone);

        String data = tc.lerData("Digite a data:");
        System.out.println("\nData: " + data);
        System.out.println("Data convertida: " + tc.converterData(data));

        boolean campo = tc.lerNum("\nDigite um dado para verificarmos se é um número:");
        System.out.println("O dado lido é: " + campo);
    }
}