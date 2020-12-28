import Usar.java.Usar;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Usar.mensagem();
        Usar.somar(4,8);
        int a = Usar.multiplicar(5,5, "Dentro");
        System.out.println("FORA DA FUNÇÃO " + a);
        int b = Usar.multiplicar(3,3);
        System.out.println("FORA DA FUNÇÃO " + b);
    }
}
