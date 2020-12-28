import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ContaCorrente c1 = new ContaCorrente();


        Scanner op = new Scanner(System.in);
        System.out.println("Selecione o tipo de operação:");
        System.out.println("1 - Saque");
        System.out.println("2 - Depósito");
        System.out.println("3 - Transferência");
        System.out.println("4 - Extrato");
        int opcoes = op.nextInt();

        c1.lerDados();

        switch (opcoes) {

            case 1:

                Scanner lerSaque = new Scanner(System.in);
                System.out.println("\nDigite o valor do saque: ");

                double saque = lerSaque.nextDouble();
                c1.saque(saque);
                c1.getSaldo();

                break;

            case 2:

                ContaCorrente cd = new ContaCorrente();

                Scanner lerDep = new Scanner(System.in);
                System.out.println("\nDigite o valor do depósito: ");

                double deposito = lerDep.nextDouble();
                c1.deposito(deposito);
                c1.getSaldo();

                break;

            case 3:

                ContaCorrente c2 = new ContaCorrente();
                c2.lerDados();

                Scanner lerOperacoes = new Scanner(System.in);
                System.out.println("\nDigite o valor da transferência: ");
                double ops = lerOperacoes.nextDouble();

                if (c1.titular.cpf.equals(c2.titular.cpf)) {
                    System.out.println("Não foi possível realizar a transferência, houve uma divergência nos documentos.");
                } else {
                    c1.transferencia(ops, c2);
                    System.out.println("Transferência realizada");
                    c1.getSaldo();
                    c2.getSaldo();
                }
                break;

            case 4:

                c1.getSaldo();

                break;
            default:

                System.out.println("Código inválido!!");

                break;
        }
    }
}
