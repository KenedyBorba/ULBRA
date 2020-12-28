import java.util.Scanner;

public class exe_02 {
    public static void main(String[] args) {
        //Uma farmácia precisa ajustar os preços de seus produtos em 12%.
        //Elabore uma classe que receba o valor do produto e aplique o percentual
        //de acréscimo. O novo valor a ser calculado deve ser arredondado para
        //mais ou para menos usando o método round. A classe deve também conter
        //um laço de repetição que encerre o programa quando o usuário fornecer o
        //valor zero (0) para o valor do produto. Dessa forma, o usuário digita o
        // valor do produto, a classe calcula e mostra o valor com acréscimo, a
        // seguir solicita um novo valor. Esse processo continua enquanto o valor
        // do produ
        // to for diferente de zero; caso contrário o programa será encerrado
        float valor, valorDesconto, valorFinal;

        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Digite o valor do produto");
            valor = input.nextFloat();
            valorDesconto = (float) (valor * 0.12);
            valorFinal = valor - valorDesconto;
            System.out.printf("O valor do produto é: " + Math.round(valorFinal) + "%n", "%.2f\n");

        } while (valor != 0);

        System.out.printf("\nFIM!!!\n");
    }
}
