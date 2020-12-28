public class Dolar {
    public static double valorEmReais;
    public static double valorDoDolar;

    public void Dolar(double valorDoDolar, double valorEmReais) {
        System.out.printf("Resultado: $ %.2f", valorEmReais * valorDoDolar);
    }
}