import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String phrase;
        String word;
        int tam;

        System.out.println("Digite a frase: ");
        phrase = teclado.nextLine();

        System.out.println("Digite a palavra: ");
        word = teclado.next();
        tam = word.length();

        while (tam > 5) {
            System.out.println("O limite é 5 caracteres, digite outra palavra: ");
            word = teclado.next();
            tam = word.length();
        }
        if (phrase.toLowerCase().contains(word.toLowerCase())) {
            System.out.println("A palavra '" + word + "' está na frase");
        } else {
            System.out.println("A palavra '" + word + "' não está na frase");
        }
    }
}