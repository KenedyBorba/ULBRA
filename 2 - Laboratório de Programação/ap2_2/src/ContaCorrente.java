import java.util.Objects;
import java.util.Scanner;

public class ContaCorrente {
    public String agencia;
    public int numero;
    public float saldo;
    public double limite;
    public Titular titular;
    static int ultimaConta = 1;
    Scanner tc = new Scanner(System.in);


    public ContaCorrente(){
        this.numero = ultimaConta;
        ultimaConta++;
        lerDados();

    }


    public ContaCorrente(int numero){
        this.numero = numero;
    }
    private void lerDados(){

        System.out.println("Digite a agência:");
        this.agencia = tc.next();
        this.saldo = 0;
        this.titular = new Titular();

        definirLimite();
    }


    public void mostrarDados(){
        System.out.println("Numero: " + this.numero);
        System.out.println("Agência: " + this.agencia);
        System.out.println("Nome: " + this.titular.nome);
        System.out.println("Idade: " + this.titular.idade);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Limite: " + this.limite);
    }

    public void definirLimite(){
        if(this.titular.idade >= 16){
            if (this.titular.idade < 18){
                this.limite = 100;
            }else if(this.titular.idade > 60){
                this.limite = 1000;
            }else{
                this.limite = 300;
            }
        }
    }

    public void editar(){
        System.out.println("Digite o nome:");
        this.titular.nome = tc.next();
        System.out.println("Digite a idade:");
        this.titular.idade = tc.nextInt();
        definirLimite();
        System.out.println("Digite a data de nascimento:");
        this.titular.dataNascimento = tc.next();

    }

    public boolean sacar(double valor){
        if(valor <= (this.limite + this.saldo)){
            this.saldo -= valor;
            System.out.println("Saque Realizado!");
            return true;
        }else return false;
    }
    public boolean depositar(double valor){
        if (valor >0){
            this.saldo += valor;
            System.out.println("Depósito Realizado!");
            return true;
        }else return false;

    }

    public boolean transferir(double valor, ContaCorrente destino){
        if(sacar(valor)){
            System.out.println("Tranferência realizada");
            return destino.depositar(valor);

        }else return  false;
    }


}
