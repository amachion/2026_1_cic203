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
    public int posNaFila (int x) {//retorna a posição de um elemento = ex 19 da lista pilhas e filas
        if (estaVazia()) return -1;
        for(int pos=primeiro, contador=1; contador <= ocupacao; pos = proximaPos(pos), contador++) 
            if (x == dados[pos]) return contador;
        return -1;
    }
    public void limpaFila () {//tira os pares = ex 15 da lista de pilhas e filas
        Fila aux = new Fila(this.capacidade);
        while (!this.estaVazia()) {
            try {
                int n = this.desenfileira();
                if (n%2 == 1)
                    aux.enfileira(n);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        //restaura a fila original
        while (!aux.estaVazia()) {
            try {
                int n = aux.desenfileira();
                if (n%2 == 1)
                    this.enfileira(n);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public Fila mergeFilas (Fila f1, Fila f2) {
        Fila f = new Fila(f1.capacidade + f2.capacidade);
        try {
            while (!f1.estaVazia() && !f2.estaVazia()) {
                f.enfileira(f1.desenfileira());
                f.enfileira(f2.desenfileira());
            }
            while (!f1.estaVazia())
                f.enfileira(f1.desenfileira());
            while (!f2.estaVazia())     
                f.enfileira(f2.desenfileira());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            return f;
        }
    }
}
class ExcecaoFilaVazia extends Exception {
    public ExcecaoFilaVazia() {
        super ("Fila vazia");
    }
}
