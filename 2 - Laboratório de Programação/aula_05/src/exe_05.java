import java.util.Scanner;

public class exe_05 {
    public static void main(String[] args) {
        String frase;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        frase = input.nextLine();
        frase = frase.toLowerCase();

        if(frase.equals("sexo") || frase.equals("sexual")){
            System.out.println("Conteúdo impróprio!");
        }else{
            System.out.println("Contéudo liberado");
        }
    }
}
