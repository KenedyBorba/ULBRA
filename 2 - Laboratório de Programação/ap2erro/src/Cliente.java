import java.util.Scanner;

import java.util.Objects;

public class Cliente{

    String cpf;
    String nome;
    int idade;
    String dataNascimento;
    ValidaCPF validaCPF = new ValidaCPF();
    public void lerDados(){
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite cpf:");
        this.cpf = tc.next();
        if(validaCPF.isCPF(this.cpf)) {
            System.out.println("Digite nome:");
            this.nome = tc.next();
            System.out.println("Digite idade:");
            this.idade = tc.nextInt();
            System.out.println("Digite data de nascimento:");
            this.dataNascimento = tc.next();
        } else System.out.println("CPF Invalido");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(cpf, cliente.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    @Override
    public String toString() {
        return  "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento='" + dataNascimento + '\'' ;
    }
}