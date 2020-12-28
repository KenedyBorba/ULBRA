import java.util.Scanner;

public class ContaCorrente{
    public String agencia;
    public int numero;
    public double saldo;
    public double limite;
    public Cliente titular;
    public static int ultimaConta = 1;



    public void lerDados(){
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite a agencia:");
        this.agencia = tc.next();
        this.numero = ultimaConta;
        this.saldo = 0;
        this.titular = new Cliente();
        this.titular.lerDados();

        if(this.titular.idade > 16){
            ultimaConta++;

            if(this.titular.idade > 60){
                this.limite = 1000;
            }else if(this.titular.idade < 18){
                this.limite = 100;
            }else{
                this.limite = 300;
            }
        }else{
            System.out.println("Não foi possível criar a conta");
        }
    }

    public void mostrar(){
        System.out.println("Cliente" + this.titular);
        System.out.println("Agencia:" + this.agencia);
        System.out.println("Numero da Conta" + this.numero);
        System.out.println("Saldo" + this.saldo);
        System.out.println("Limite" + this.limite);

    }

    public boolean depositar(double valor){
        if (valor >0){
            this.saldo += valor;
            System.out.println("Deposito Realizado!");
            return true;
        }else return false;

    }

    public void mostrarSaldo(){
        System.out.println("------------SALDO--------------");
        System.out.println("Cliente" + this.titular.nome);
        System.out.println("Agencia:" + this.agencia);
        System.out.println("Numero da Conta: " + this.numero);
        System.out.println("Saldo" + this.saldo);
        System.out.println("Limite" + this.limite);
        System.out.println("Valor disponível para saque: " + (this.saldo + this.limite));

    }

    public boolean sacar(double valor){
        if(valor <= (this.limite + this.saldo)){
            this.saldo -= valor;
            System.out.println("Saque Realizado!");
            return true;
        }else return false;

    }

    public boolean transferir(double valor, ContaCorrente destino){
        if(sacar(valor)){
            System.out.println("Tranferencia realizada");
            return destino.depositar(valor);

        }else return  false;
    }
}