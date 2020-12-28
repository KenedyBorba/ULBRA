import java.util.Random;

public class exe_01 {
    public static void main(String[] args) {
        int result = 0;

        Random rodando =  new Random();

        for (int i = 0; i < 3; i++) {
            int dado = rodando.nextInt(6)+1;
            result += dado;
                System.out.println(dado);
        }
            System.out.println("A soma das jogadas foi " + result);

        //Crie uma classe que simule a jogada de um dado de seis lados (números de 1 a 6)
        //por três vezes. Ao  final some seus valores e apresente o resultado das três jogadas.
    }
}
