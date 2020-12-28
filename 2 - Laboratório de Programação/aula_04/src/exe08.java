import java.util.Random;

public class exe08 {
    public static void main(String[] args) {

        int par[] = new int[10];
        int impar[] = new int[10];
        Random aleatorio = new Random();
        int numeroGerado;

        int ip=0;
        int ii=0;
        for(int i=0; i<10; i++){
            numeroGerado = aleatorio.nextInt(1000);
            if(numeroGerado%2==0){
                par[ip] = numeroGerado;
                ip++;
            }else{
                impar[ii] = numeroGerado;
                ii++;
            }
        }

        System.out.println("PAR");
        for(int i=0; i<ip; i++){
            System.out.println(par[i]);
        }
        System.out.println("IMPAR");
        for(int i=0; i<ii; i++){
            System.out.println(impar[i]);
        }

    }
}