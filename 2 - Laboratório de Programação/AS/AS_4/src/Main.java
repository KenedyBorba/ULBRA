import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] argn) {
        DecimalFormat formatado = new DecimalFormat("#.##");
        ArrayList<Item> biblioteca = new ArrayList<>();
        Scanner tc = new Scanner(System.in);
        int opcoes = 0;

        do {
            System.out.println("1 - Adicionar itens");
            System.out.println("2 - Remover itens");
            System.out.println("3 - Listar itens");
            System.out.println("4 - Ver o total da lista");
            System.out.println("5 - Sair dos itens");
            opcoes = tc.nextInt();

            switch (opcoes) {
                case 1: {
                    System.out.println("Digite o nome do item:");
                    String nome = tc.next();
                    System.out.println("Digite a quantidade:");
                    int quant = tc.nextInt();
                    System.out.println("Digite o valor do item:");
                    Double valor = tc.nextDouble();
                    Item i = new Item(nome, valor, quant);
                    biblioteca.add(i);
                    break;
                }

                case 2: {
                    if (biblioteca.size() > 0) {
                        System.out.println("Digite o nome do item");
                        String nome = tc.next();
                        Item remover = new Item(nome);
                        if (biblioteca.remove(remover)) {
                            System.out.println("Item removido!");
                        } else {
                            System.out.println("Não foi encontrado!");
                        }
                    } else {
                        System.out.println("Não existe nenhum item com esse nome");
                    }
                    break;
                }

                case 3: {
                    if (biblioteca.size() > 0) {
                        for (int i = 0; i < biblioteca.size(); i++) {
                            System.out.println(biblioteca.get(i).toString());
                        }
                    } else {
                        System.out.println("Não existe nenhum item com esse nome");
                    }
                    break;
                }

                case 4: {
                    if (biblioteca.size() > 0) {
                        double soma = 0;
                        for (int i = 0; i < biblioteca.size(); i++) {
                            soma += biblioteca.get(i).valor * biblioteca.get(i).quant;
                        }
                        System.out.println(formatado.format(soma));
                    } else {
                        System.out.println("Ainda não há itens!");
                    }
                    break;
                }

            }
        } while (opcoes != 5);
        System.out.println("Você saiu!");
    }
}