public class NossoVetor {
    private int[] vetor;
    private int ocupacao;
    private int capacidade;
    

    public NossoVetor () {
        vetor = new int[10];
        ocupacao = 0; //por clareza
        capacidade = 10;
    }
    public NossoVetor (int capacidade){
        vetor = new int[capacidade];
        ocupacao = 0; //por clareza
        this.capacidade = capacidade;
    }
    public boolean estaVazio1 () {
        if (ocupacao == 0) return true;
        else return false;
    }
    public boolean estaVazio2 () {
        if (ocupacao == 0) return true;
        return false;
    }
    public boolean estaVazio3 () {
        return ocupacao == 0;
    }
    public boolean estaVazio4 () {
        return ocupacao == 0 ? true : false;
    }
    public boolean estaCheio () {
        return ocupacao == capacidade;
    }
    // public boolean adiciona (int elemento) {
    //     if (estaCheio()) return false;
    //     else {
    //         vetor[ocupacao++] = elemento;
    //         //ocupacao++;
    //         return true;
    //     }
    // }
    public void adiciona (int i) {
        if (estaCheio()) {
            redimensiona(capacidade * 2);
        }
        vetor[ocupacao++] = i;
    }
    // public int remove () {
    //     if (estaVazio3()) return -1; //cuidado
    //     //ocupacao--;
    //     return vetor[--ocupacao];
    // }
    public int remove () {
        if (estaVazio3()) return -1;
        int removido = vetor[--ocupacao];
        if (capacidade >= 10 && ocupacao <= capacidade/4) {
            redimensiona(capacidade / 2);
        }
        return removido;
    }
    private void redimensiona (int novaCapacidade) {
        int[] temp = new int[novaCapacidade];
        for (int j=0; j < ocupacao; j++) {
            temp[j] = vetor[j];
        }
        vetor = temp;
        capacidade = novaCapacidade;
    }
    public int size() {
        return ocupacao;
    }
    public int getElemento (int indice) {
        if (indice > ocupacao -1) return -1;
        //esta condição atende a condição de vetor vazio também
        return vetor[indice];
    }
    public boolean contains (int elemento) {
        for (int i=0; i < ocupacao; i++)
            if (vetor[i] == elemento)
                return true;
        return false;
    }
    public NossoVetor listaPosicoes (int elemento) {
        NossoVetor lista = new NossoVetor(this.ocupacao);
        for (int i=0; i<this.ocupacao; i++)
            if (this.vetor[i] == elemento)
                lista.adiciona(i);
        return lista;
    }
    @Override
    public String toString () {
        if (estaVazio3()) return "vetor vazio";
        String s = "capacidade = " + capacidade + "\n";
        for (int i=0; i < ocupacao; i++)
            s += vetor[i] + " ";
        return s;
    }
    public void esvaziaVetor () {
        ocupacao = 0;
    }
}