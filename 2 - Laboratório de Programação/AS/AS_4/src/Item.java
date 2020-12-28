import java.util.Objects;

public class Item {
    public String nome;
    public int quant;
    public Double valor;

    public Item(String num) {
        nome = num;
    }

    public Item(String num, Double p, int q) {
        nome = num;
        valor = p;
        quant = q;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", quant=" + quant +
                ", preço=" + valor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(nome, item.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}