public class DolarBitcoin {
    public static double valorEmDolares;
    public static double cotacaoDolar;
    public static double valorEmReais;
    public static double valorDoBitcoin;

    public void Dolarbit(double valorEmDolares, double cotacaoDolar, double valorEmReais, double valorDoBitcoin) {
        System.out.printf("Valor em real: R$%.2f", valorEmReais * cotacaoDolar);
        System.out.printf("\nValor em bitcoin: %.2f", (valorEmDolares / cotacaoDolar) / valorDoBitcoin);
    }
}