public class Pessoa {
    private String nome;
    private int anoNasc;
    public Pessoa(String nome, int anoNasc) {
        this.nome = nome;
        this.anoNasc = anoNasc;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getAnoNasc() {
        return anoNasc;
    }
    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }
    @Override
    public String toString() {
        return "[nome=" + nome + ", anoNasc=" + anoNasc + "]";
    }
    
}
