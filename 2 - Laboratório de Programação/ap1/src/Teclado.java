import java.util.Scanner;

public class Teclado {
    Scanner tc = new Scanner(System.in);

    public String lerString(){

        String m = "Digite uma String: ";
        return lerString(m);
    }

    public String lerString(String msg){
        String n;

        System.out.println(msg);
        n = tc.next();
        return n;
    }

    public int lerInt(){

        String m = "\nDigite um número inteiro: ";
        return lerInt(m);
    }

    public int lerInt(String msg){
        int n;

        System.out.println(msg);
        n = tc.nextInt();
        return n;
    }

    public float lerFloat(){

        String m = "\nDigite um Float: ";
        return lerFloat(m);
    }

    public float lerFloat(String msg){
        float n;

        System.out.println(msg);
        n = tc.nextFloat();
        return n;
    }

    public double lerDouble(){

        String m = "\nDigite um Double: ";
        return lerDouble(m);
    }

    public double lerDouble(String msg){
        double n;

        System.out.println(msg);
        n = tc.nextDouble();
        return n;
    }

    public char lerChar(){

        String m = "\nDigite um Char: ";
        return lerChar(m);
    }

    public char lerChar(String msg){
        char n;

        System.out.println(msg);
        n = tc.next().charAt(0);
        return n;
    }

    public String lerFone(String msg){
        boolean valido = false;
        do {
            System.out.println("\nDigite o telefone no formato DDD-XXXXXXXXX: ");
            String fone = tc.next();
            if (fone.charAt(3) == '-') {
                String a = fone.substring(0,3);
                String b = fone.substring(4,13);
                String oFone = a + "-" + b;
                valido = true;
                return oFone;
            }
        } while(valido == false);

        return null;
    }

    public String lerData(String msg){
        boolean valido = false;
        do {
            System.out.println("\nDigite uma data: ");
            String data = tc.next();
            String dia;
            String mes;
            //10/10/2020
            if (data.charAt(2) == '/' && data.charAt(5) == '/') {
                    dia = data.substring(0,2);
                    mes = data.substring(3,5);
                    String ano = data.substring(6,10);
                    String newData = dia + "/" + mes + "/" + ano;
                    valido = true;
                    return newData;
            }
        } while(valido == false);

        return null;
    }

    public String converterData(String data){
        if (data.charAt(2) == '/' && data.charAt(5) == '/') {
            String dia = data.substring(0,2);
            String mes = data.substring(3,5);
            String ano = data.substring(6,10);
            String newData = mes + "/" + dia + "/" + ano;
            return newData;
        }
        return null;
    }

    public boolean lerNum(String msg){
        System.out.println(msg);
        String campo = tc.next();
        return campo.matches("[0-9]+");
    }


}