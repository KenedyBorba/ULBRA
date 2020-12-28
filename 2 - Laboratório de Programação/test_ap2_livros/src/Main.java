import com.company.Livro;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] argn) {
        int opcao = 0;
        ArrayList<Livro> biblioteca = new ArrayList<>();
        Scanner tc = new Scanner(System.in);
        do {
            System.out.println("1- Criar livro");
            System.out.println("2- Editar livro");
            System.out.println("3- Remover livro");
            System.out.println("4- Listar livros");
            System.out.println("5- Sair livros");
            opcao = tc.nextInt();

            switch (opcao) {
                case 1: {
                    System.out.println("Digite o nome do livro");
                    String nome = tc.next();
                    System.out.println("Digite o número de páginas do livro");
                    int paginas = tc.nextInt();
                    Livro l = new Livro(nome, paginas);
                    biblioteca.add(l);
                    break;
                }

                case 2: {
                    System.out.println("Digite o ISBN do livro para editar");
                    String isbn = tc.next();
                    Livro buscar = new Livro(isbn);

                    if (biblioteca.contains(buscar)) {
                        System.out.println("Livro Encontrado");
                        int p = biblioteca.indexOf(buscar);
                        buscar = biblioteca.get(p);
                        buscar.editar();
                        System.out.println("Livro salvo");
                    } else {
                        System.out.println("Não há livro");
                    }
                    break;
                }

                case 3: {
                    if (biblioteca.size() > 0) {
                        System.out.println("Digite o ISBN do livro para remover");
                        String isbn = tc.next();
                        Livro remover = new Livro(isbn);
                        if (biblioteca.remove(remover)) {
                            System.out.println("Livro removido");
                        } else {
                            System.out.println("Não foi encontrado");
                        }
                    } else {
                        System.out.println("Não há livros");
                    }
                    break;
                }

                case 4: {
                    if (biblioteca.size() > 0) {
                        for (int i = 0; i < biblioteca.size(); i++) {
                            System.out.println(biblioteca.get(i).toString());
                        }
                    } else {
                        System.out.println("Não há livros");
                    }
                }
            }

        } while (opcao != 5);
        System.out.println("Bye");
    }
}