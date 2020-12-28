import java.util.Objects;
import java.util.Scanner;

public class Cliente{
    String cpf;
    String nome;
    int idade;
    String dataNasc;

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

    public void ler(){
        Scanner tc = new Scanner(System.in);

        do{
            System.out.print("\nDigite o CPF: ");
            cpf = tc.next();
            System.out.printf("Resultado: ");


            if (ValidaCPF.isCPF(cpf)) {
                System.out.printf("%s\n", ValidaCPF.imprimeCPF(cpf));

            } else {
                System.out.print("Erro, CPF inválido !!!\n");

            }

        }while (!ValidaCPF.isCPF(cpf));

        System.out.print("\nDigite o nome: ");
        this.nome=tc.next();

        System.out.print("\nDigite a idade: ");
        this.idade=tc.nextInt();

        System.out.print("\nDigite a data de nascimento: ");
        this.dataNasc=tc.next();


    }

    @Override
    public String toString() {
        return  "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento='" + dataNasc + '\'' ;
    }

}