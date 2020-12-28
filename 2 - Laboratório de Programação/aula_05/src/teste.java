import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Random;

public class teste {
    public static void main(String[] args) {

        System.out.println(Math.PI);
        System.out.println(Math.E);

        System.out.println(Math.ceil(10.9));
        System.out.println(Math.ceil(10.2));
        System.out.println(Math.floor(10.9));
        System.out.println(Math.floor(10.2));
        System.out.println(Math.round(10.9));
        System.out.println(Math.round(10.2));
        System.out.println(Math.max(5,10));
        int sorteio=(int)(Math.random()*10);
        System.out.println(sorteio);
        Random rd = new Random();
        System.out.println(rd.nextInt(10));

        Locale l= Locale.getDefault();
        DecimalFormat numero = new DecimalFormat();
        double n1=20000.15555;
        double n2=44000.999;
        double n3=2;

        if(l.getCountry().equals("BR")){
            numero.applyPattern("R$ ###,###.00");
        } else{
            numero.applyPattern("USS ######.00");
        }


        System.out.println(numero.format(n1));
        System.out.println(numero.format(n2));
        System.out.println(numero.format(n3));

        String minhaFrase= "SoU JaVa e já era";
        System.out.println(minhaFrase.length());
        System.out.println(minhaFrase.charAt(0));
        System.out.println(minhaFrase.toUpperCase());
        System.out.println(minhaFrase.toLowerCase());
        System.out.println(minhaFrase);
        System.out.println(minhaFrase.substring(9));
        System.out.println(minhaFrase.substring(3,10));

        // sqrt: retorna a raiz quadrada de um número. Math.sqrt()
        // pow: retorna a base elevada ao expoente power. Math.pow()
        // abs: retorna o valor absoluto de um número "x". Math.abs(x)

    }
}