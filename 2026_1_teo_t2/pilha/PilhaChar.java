public class PilhaChar {
    private int topo;
    private char[] dados;
    private int capacidade;
    public PilhaChar (int capacidade) {
        dados = new char[capacidade];
        topo = 0;
        this.capacidade = capacidade;
    }
    public PilhaChar () {
        this(10);
    }
    public boolean pilhaVazia () {
        return topo == 0;
    }
    public boolean pilhaCheia () {
        return topo == capacidade;
    }
    public int tamanho () {
        return topo;
    }
    public boolean empilha (char i) {
        if (pilhaCheia()) return false;
        dados[topo++] = i;
        return true;
    }
    public char desempilha () {
        return dados[--topo];
    }
    @Override
    public String toString () {
        if (pilhaVazia()) return "pilha vazia";
        String s = "";
        for (int i=topo-1; i>=0; i--) {
            s += dados[i] + "\n";
        }
        return s;
    }
}