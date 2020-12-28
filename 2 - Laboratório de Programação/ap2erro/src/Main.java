class Main {
    public static void main(String[] args) {
        ContaCorrente c1= new ContaCorrente();
        ContaCorrente c2 = new ContaCorrente();
        c1.lerDados();
        c2.lerDados();
        if(!c1.depositar(100)){
            System.out.println("Não foi possível depositar");
        }
        if(!c1.sacar(500)){
            System.out.println("Saldo insuficiente");
        }


        if(!c1.transferir(50, c2)){
            System.out.println("Erro ao transferir");
        }

        c1.mostrarSaldo();
        c2.mostrarSaldo();

        if(c2.titular.equals(c1.titular)){
            System.out.println("CPF iguais");
        }
    }
}
