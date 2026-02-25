public class NossoVetor {
    private int vetor[];
    private int ocupacao;
    private int capacidade;

    public NossoVetor () {
        this(10); //chamada do construtor da linha 11
        // vetor = new int[10];
        // ocupacao = 0;  //por clareza
    }
    public NossoVetor (int capacidadeInicial) {
        vetor = new int[capacidadeInicial];
        ocupacao = 0;
        capacidade = capacidadeInicial;
    }
    public int getCapacidade () {
        return capacidade;
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
    // private void dobra () {
    //     int[] temp = new int[2*capacidade];
    //     for (int i=0; i<ocupacao; i++) temp[i] = vetor[i];
    //     capacidade = 2 * capacidade;
    //     vetor = temp;
    // }
    // private void reduz_metade () {
    //     int[] temp = new int[capacidade/2];
    //     for (int i=0; i<ocupacao; i++) temp[i] = vetor[i];
    //     capacidade = capacidade / 2;
    //     vetor = temp;
    // }
    private void redimensiona (int novaCapacidade) {
        int[] temp = new int[novaCapacidade];
        for (int i=0; i<ocupacao; i++) temp[i] = vetor[i];
        capacidade = novaCapacidade;
        vetor = temp;
    }
    //public boolean adiciona (int elemento) {
    public void adiciona (int elemento) {
        //if (estaCheio()) return false;
        if (estaCheio()) redimensiona(capacidade * 2);
        vetor[ocupacao++] = elemento; //pós incremento
        //ocupacao++;
        //return true;
    }
    public int removeUltimo () { 
        //só funciona se a aplicação testar o vazio antes
        //ocupacao--;
        int quemSai =  vetor[--ocupacao]; //pré decremento
        //se depois de remover a ocupação cair para 1/4, vamos reduzir à metade
        if (capacidade >= 10 && ocupacao <= capacidade / 4)
            redimensiona(capacidade / 2);
        return quemSai;
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
        if (estaVazio3()) return "vetor vazio";
        String s = "ocupacao = " + ocupacao + ", capacidade = " + capacidade + "\n";
        for (int i=0; i < ocupacao; i++) {
            s = s + vetor[i] + " ";
        }
        return s + "\n";
    }
} 