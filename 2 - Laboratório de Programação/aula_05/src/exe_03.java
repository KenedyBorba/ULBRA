import java.util.Random;

public class exe_03 {
    public static void main(String[] args) {
        //Crie uma classe que gera um número aleatoriamente (entre 5 e 10) por
        //Math.random. Em seguida, faça com que apareça em tela uma senha
        //numérica contendo a mesma quantidade de dígitos correspondentes ao
        //valor aleatório gerado. Apresente em tela o número sorteado e a senha.

        Random numAleatorio = new Random();

        int num = numAleatorio.nextInt(5) + 5;
        System.out.println("O número de digitos que terá a senha é: " + num);

        System.out.println("A senha gerada é: ");

        for (int i = 0; i < num; i++) {
            System.out.print((int)(Math.random()*10));
        }
    }
}
