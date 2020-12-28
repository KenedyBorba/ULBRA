import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opcao = 0;
        Scanner tc = new Scanner(System.in);
        Scanner valorEmDolares = new Scanner(System.in);
        Scanner valorEmReais = new Scanner(System.in);
        Scanner valorDoDolar = new Scanner(System.in);
        Scanner valorDoBitcoin = new Scanner(System.in);
        Scanner valorDolar = new Scanner(System.in);
        Scanner quantDolar = new Scanner(System.in);
        Scanner cotacaoDolar = new Scanner(System.in);

        do {
            System.out.println("\n1- para retornar o valor em dólar");
            System.out.println("2- para exibir o valor em bitcoin");
            System.out.println("3- para retornar o valor em Reais.");
            System.out.println("4- para exibir o valor em bitcoin e retornar o valor em reais.");
            System.out.println("5- Sair");
            opcao = tc.nextInt();

            switch (opcao) {
                case 1: {
                    System.out.println("Digite o valor em reais a ser convertido: ");
                    double real = valorEmReais.nextDouble();
                    System.out.println("Digite cotação do dólar: ");
                    double cotacao = valorDoDolar.nextDouble();
                    Dolar ad = new Dolar();
                    ad.Dolar(Dolar.valorEmReais = real, Dolar.valorDoDolar = cotacao);
                    break;
                }

                case 2: {
                    System.out.println("Digite o valor em reais a ser convertido: ");
                    double real = valorEmReais.nextDouble();
                    System.out.println("Digite a cotação do bitcoin: ");
                    double bit = valorDoBitcoin.nextDouble();
                    Bitcoin total = new Bitcoin();
                    total.Bitcoin(Bitcoin.valorEmReais = real, Bitcoin.valorDoBitcoin = bit);
                    break;
                }
                case 3: {
                    System.out.println("Digite o valor em dólares a ser convertido: ");
                    double dolar = quantDolar.nextDouble();
                    System.out.println("Digite a cotação do dólar: ");
                    double cotacao = valorDolar.nextDouble();
                    Real total = new Real();
                    total.Real(Real.quantDolar = dolar, Real.valorDolar = cotacao);
                    break;
                }
                case 4: {
                    System.out.println("Digite o valor em dólares a ser convertido: ");
                    double dolar = valorEmDolares.nextDouble();
                    System.out.println("Digite a cotação do dólar: ");
                    double cotacao = cotacaoDolar.nextDouble();
                    System.out.println("Digite o valor em reais: ");
                    double reais = valorEmReais.nextDouble();
                    System.out.println("Digite a cotação do Bitcoin: ");
                    double cotBitcoin = valorDoBitcoin.nextDouble();
                    DolarBitcoin total = new DolarBitcoin();
                    total.Dolarbit(DolarBitcoin.valorEmDolares = dolar, DolarBitcoin.cotacaoDolar = cotacao, DolarBitcoin.valorEmReais = reais, DolarBitcoin.valorDoBitcoin = cotBitcoin);
                    break;
                }
            }
        }while (opcao != 5);
        System.out.println("Você saiu");
    }
}