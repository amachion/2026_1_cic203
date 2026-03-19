public class Pilha {
    private int topo;
    private int[] dados;
    private int capacidade;
    public Pilha (int capacidade) {
        dados = new int[capacidade];
        topo = 0;
        this.capacidade = capacidade;
    }
    public Pilha () {
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
    public boolean empilha (int i) {
        if (pilhaCheia()) return false;
        dados[topo++] = i;
        return true;
    }
    public int desempilha () {
        //teste de pilha vazia vai ficar para a aplicação
        return dados[--topo];
    }
}