public class Bitcoin {
    public static double valorDoBitcoin;
    public static double valorEmReais;

    public void Bitcoin(double valorEmReais, double valorDoBitcoin) {
        System.out.printf("Resultado: R$%.2f", valorEmReais / valorDoBitcoin);
    }
}