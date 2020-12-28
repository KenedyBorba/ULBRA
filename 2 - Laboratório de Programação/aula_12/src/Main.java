import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        for (int i=0; i<5; i++){
            Scanner tc = new Scanner(System.in);
            nomes.add(tc.next()); // adiciona uma String, nesse caso é um nome. | deste modo vc conegue escolher
                                  // os nomes manualmente
        }
        nomes.add("Ramon"); // adiciona uma String, nesse caso é um nome.
        nomes.add("Rafael");
        nomes.add("Diego");
        nomes.add("Gean");
        nomes.add(0, "Alex");
        nomes.add(1, "Willian");
        System.out.println(nomes.size()); // size() retorna o tamanho da lista
        System.out.println("REMOVE RAMON " + nomes.remove("Ramon")); // remove() remove
        System.out.println("REMOVE 0 " + nomes.remove(0)); // remove e mostra o valor que esta na posição
        System.out.println(nomes.get(10)); // get() pega o valor que esta dentro do parenteses e mostra
        System.out.println(nomes.indexOf("Ramon")); // indexOf() retorna a posição do valor
        System.out.println(nomes.contains("Gean")); // mostra de o valor existe - se existir é TRUE se não FALSE
    }
}
