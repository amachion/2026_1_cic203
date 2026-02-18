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
    public boolean adiciona (int elemento) {
        if (estaCheio()) return false;
        else {
            vetor[ocupacao++] = elemento;
            //ocupacao++;
            return true;
        }
    }
    public int remove () {
        if (estaVazio3()) return -1; //cuidado
        //ocupacao--;
        return vetor[--ocupacao];
    }
    @Override
    public String toString () {
        if (estaVazio3()) return "vetor vazio";
        String s = "";
        for (int i=0; i < ocupacao; i++)
            s += vetor[i] + " ";
        return s;
    }
}