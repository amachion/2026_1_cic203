public class Pessoa {
    private String nome;
    private int anoN;
    public Pessoa(String nome, int anoN) {
        this.nome = nome;
        this.anoN = anoN;
    }
    @Override
    public String toString() {
        return "[" + nome + ", " + anoN + "]";
    }
    
}
