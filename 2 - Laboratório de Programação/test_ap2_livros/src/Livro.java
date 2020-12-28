package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Livro {
    public String titulo;
    public String isbn;
    public int paginas;
    public double preco;
    public static int codlivro = 0;

    public Livro(String is) {
        isbn = is;
    }

    public Livro(String nome, int p) {
        codlivro++;
        titulo = nome;
        isbn = nome.charAt(0) + "" + codlivro;
        paginas = p;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "título='" + titulo + '\'' +
                ", isbn=" + isbn + '\'' +
                ", páginas=" + paginas +
                ", preço=" + preco +
                '}';

    }

    public void editar() {
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite o nome do livro");
        this.titulo = tc.next();
        System.out.println("Digite o valor do livro");
        this.preco = tc.nextDouble();
        System.out.println("Digite o número de páginas do livro");
        this.paginas = tc.nextInt();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(isbn, livro.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }
}