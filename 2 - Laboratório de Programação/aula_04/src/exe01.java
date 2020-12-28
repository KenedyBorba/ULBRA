import java.util.Scanner;

class exe01 {

    /*
    Escreva um programa que crie um array de inteiros data e use um laço for para criar um novo String que exiba o conteúdo do array data entre chaves e separado por vírgulas. Por exemplo, se o array data tiver tamanho 4 e armazenar os valores 3, 4, 1, 5, o String “{3, 4, 1, 5}” deve ser criado e exibido.
    */
    public static void main(String[] args) {


        int[] data = {3, 5, 5, 5, 5, 5, 5, 4, 1, 5};

        String exibe = "{";

        for (int i = 0; i < data.length; i++) {
            if (i == data.length - 1) {
                exibe += Integer.toString(data[i]) + "}";
            } else {
                exibe += Integer.toString(data[i]) + ", ";
            }
        }

        System.out.println("Os valores armazenados são: " + exibe);


    }
}