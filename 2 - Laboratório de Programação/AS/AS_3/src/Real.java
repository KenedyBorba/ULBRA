public class Real {
    public static double quantDolar;
    public static double valorDolar;

    public void Real(double quantDolar, double valorDolar) {
        System.out.printf("Resultado: R$ %.2f", quantDolar * valorDolar);
    }
}