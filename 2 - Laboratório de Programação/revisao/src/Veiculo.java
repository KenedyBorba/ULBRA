public class Veiculo {

    private String ano;
    private String placa;
    private String modelo;
    private String cor;
    public static int number=0;
    private int chassi;
    private boolean isLigado;

    public int getChassi(){
        return chassi;
    }

    public int setChassi(){
        number++;
        this.chassi = number;
    }

    public String getAno(){
        return ano;
    }

    public  void setAno(){
        if(ano>1900){
            this.ano = ano;
        }else{
            this.ano=000;
        }
    }

    public void setAno(int ano) {
        if(ano>1900){
            this.ano = ano;
        } else{

        }
    }

    public void getModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor(){
        return cor.toLowerCase();
    }

    public void setCor(String cor){
        this.cor = cor.toUpperCase();
    }


    public Veiculo(){
        number++;
    }

    public boolean ligar(){
        if(this.isLigado=false) {
            this.isLigado=true;
            return this.isLigado;
        }else{
            this.isLigado=false;
            return this.isLigado;
        }
    }


}
