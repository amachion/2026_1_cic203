public class NossoVetor {
    private int vetor[];
    private int ocupacao;

    public NossoVetor () {
        vetor = new int[10];
        ocupacao = 0;  //por clareza
    }
    public NossoVetor (int capacidadeInicial) {
        vetor = new int[capacidadeInicial];
        ocupacao = 0;
    }
    public int getCapacidade () {
        return vetor.length;
    }
    public boolean estaVazio1 () {
        if (ocupacao == 0)
            return true;
        else 
            return false;
    }
    public boolean estaVazio2 () {
        if (ocupacao == 0) {
            return true;
        }
        return false;
    }
    public boolean estaVazio3 () {
        return ocupacao == 0;
    }
    public boolean estaVazio4 () {
        return ocupacao == 0 ? true : false;
    } 
    public boolean estaCheio () {
        return ocupacao == vetor.length;
    }
    public boolean adiciona (int elemento) {
        if (estaCheio()) return false;
        vetor[ocupacao++] = elemento; //pós incremento
        //ocupacao++;
        return true;
    }
    public int removeUltimo () { //se estiver vazio, devolve -1
        if (estaVazio3()) return -1;
        //ocupacao--;
        return vetor[--ocupacao]; //pré decremento
    }
    public int indiceDe (int elemento) {
        //devolve índice da primeira ocorrência do elemento se existir, ou -1 caso contrário
        for (int i=0; i < ocupacao; i++) {
            if (elemento == vetor[i]) return i;
        }
        return -1;
    }
    @Override
    public String toString () {
        String s = "";
        for (int i=0; i < ocupacao; i++) {
            s = s + vetor[i] + " ";
        }
        return s + "\n";
    }
} 