import java.util.Objects;
import java.util.Scanner;

public class ContaCorrente{
    public String agencia;
    public int numero;
    public static int ultimaConta=1;
    public double saldo;
    public double limite;
    public Cliente titular;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContaCorrente that = (ContaCorrente) o;
        return numero == that.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }

    public ContaCorrente(int num){
        this.numero=num;
    }


    public ContaCorrente(String agencia, double saldo, double limite, Cliente c){
        this.numero = ultimaConta;
        ultimaConta++;
        this.titular=c;
        this.saldo = saldo;
        //aplicar regra de
        this.agencia=agencia;
        definirLimite();
    }

    public ContaCorrente(){
        this.numero = ultimaConta;
        ultimaConta++;
        lerDados();
    }

    public ContaCorrente(Cliente cliente){
        this.numero = ultimaConta;
        ultimaConta++;
        lerDados(cliente);
    }

    private void lerDados(){
        Scanner tc = new Scanner(System.in);
        System.out.println("\nDigite a agencia");
        this.agencia = tc.next();
        System.out.println("gerendo sua conta...");
        this.saldo=0;
        this.titular = new Cliente();
        this.titular.ler();
        definirLimite();
    }

    private void definirLimite() {
        if(this.titular.idade>16){
            if(this.titular.idade>60){
                this.limite=1000;
            }else if (this.titular.idade<18){
                this.limite=100;
            } else{
                this.limite=300;
            }
        } else {
            System.out.println("\n-- Não foi possível --");
        }
    }

    private void lerDados(Cliente cliente){
        Scanner tc = new Scanner(System.in);
        System.out.println("\nDigite a agencia");
        this.agencia = tc.next();
        System.out.println("gerando sua conta...");
        this.saldo=0;
        this.titular = cliente;
        if (this.titular.idade>16){
            if(this.titular.idade>60){
                this.limite=1000;
            }else if(this.titular.idade>18){
                this.limite=100;
            } else{
                this.limite=300;
            }
        } else {
            System.out.println("\n-- Não foi possível --\n");
        }
    }

    public void mostrar(){
        System.out.println("\nAgência: " + this.agencia);
        System.out.println("Numero da Conta: " + this.numero);
        System.out.println("Cliente: " + this.titular.toString());
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Limite: " + this.limite);

    }

    public boolean transferir(double valor, ContaCorrente destino){
        if(sacar(valor)){
            return destino.depositar(valor);
        } else{
            return false;
        }
    }

    public boolean depositar(double valor){
        if(valor>0){
            this.saldo+=valor;
            return true;
        }else{
            return false;
        }
    }

    public boolean sacar(double valor){
        if(valor<=(saldo+limite)){
            this.saldo-=valor;
            return true;
        }else{
            System.out.println("Saldo insuficiente");
            return false;
        }
    }

    public void getSaldo(){
        System.out.println("-------------------------");
        System.out.println("Cliente: "+this.titular.nome);
        System.out.println("Agência: "+this.agencia);
        System.out.println("Número: "+this.numero);
        System.out.println("Saldo: "+this.saldo);
        System.out.println("Limite: "+this.limite);
        System.out.println("Valor disponível para saque: "+(this.limite+this.saldo));
    }


    /*public void lerDados() {

        Scanner tc = new Scanner(System.in);
        System.out.print("\nInforme a agência: ");
        this.agencia = tc.next();
        this.saldo = 0;
        this.titular = new Cliente();
        this.titular.ler();

    }

    private void definirLimite(){
        if(this.titular.idade>16){
            if(this.titular.idade>60){
                this.limite=1000;
            }else if(this.titular .idade<18){
                this.limite=100;
            }else{
                this.limite=300
            }
        }else{
            System.out.println("Não foi possível");
        }
    }

    public boolean transferencia(double valor, ContaCorrente destino){
        if(saque(valor)){
            destino.deposito(valor);
        }else{
            return false;
        }
        return false;
    }
    public boolean deposito(double valor){
        if(valor>0){
            this.saldo+= valor;
            return true;
        }else{
            return false;
        }
    }

    public boolean saque(double valor){
        if(valor<=(saldo+limite)){
            this.saldo-=valor;
            return true;
        }else{
            System.out.println("Saldo insuficiente");
            return false;
        }
    }
    public void getSaldo(){
        System.out.println("-------------------------");
        System.out.println("Cliente: "+this.titular.nome);
        System.out.println("Agência: "+this.agencia);
        System.out.println("Número: "+this.numero);
        System.out.println("Saldo: "+this.saldo);
        System.out.println("Limite: "+this.limite);
        System.out.println("Valor disponível para saque: "+(this.limite+this.saldo));
    }
*/
}
