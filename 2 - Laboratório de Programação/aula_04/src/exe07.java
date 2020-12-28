import java.util.Random;

public class exe07 {

    public static void main(String[] args) {
        int[][] pixels = new int[40][40];
        Random cor = new Random();
        for (int l = 0; l < 40; l++) {
            for (int c = 0; c < 40; c++) {
                pixels[l][c] = cor.nextInt(256);

            }
        }
        for (int l = 0; l < 40; l++) {
            for (int c = 0; c < 40; c++) {
                System.out.print(pixels[l][c] + " ");
            }
            System.out.println(" ");

        }
    }
}