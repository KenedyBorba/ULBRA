import java.util.Scanner;

public class exe_04 {
    public static void main(String[] args) {
        String frase;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um frase: ");
        frase = input.nextLine();
        frase = frase.trim();

        for(int i = frase.length()-1; i>=0; i--){

                System.out.print(frase.charAt(i));

        }

    }
}
