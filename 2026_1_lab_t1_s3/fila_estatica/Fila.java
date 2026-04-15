public class Fila {
    private int[] dados;
    private int primeiro, ultimo;
    private int ocupacao, capacidade;
    public Fila (int capacidade) {
        dados = new int[capacidade];
        this.capacidade = capacidade;
        primeiro = 0; //por clareza
        ultimo = 0; //por clareza
        ocupacao = 0; //por clareza
    }
    public boolean estaVazia () {
        return ocupacao == 0;
    }
    public boolean estaCheia () {
        return ocupacao == capacidade;
    }
    private int proximaPos (int pos) {
        return (pos + 1) % capacidade;
    }
    //se fila cheia, devolver false = fracasso
    public boolean enfileira (int i) {
        if (estaCheia()) return false;
        dados[ultimo] = i;
        ultimo = proximaPos(ultimo);
        ocupacao++;
        return true;
    }
    public int desenfileira() throws ExcecaoFilaVazia {
        if (estaVazia()) 
            throw new ExcecaoFilaVazia();
        int temp = dados[primeiro];
        primeiro = proximaPos(primeiro);
        ocupacao--;
        return temp;
    }
    @Override
    public String toString () {
        if (estaVazia()) return "fila vazia";
        String s = "";
        for(int pos=primeiro, contador=1; contador <= ocupacao; pos = proximaPos(pos), contador++) {
            s += dados[pos] + " ";
        }
        return s;
    }
}
class ExcecaoFilaVazia extends Exception {
    public ExcecaoFilaVazia() {
        super ("Fila vazia");
    }
}
