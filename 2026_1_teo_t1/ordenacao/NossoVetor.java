import java.util.Random;

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
        if (estaVazio3()) return "\nvetor vazio";
        String s = "\ncapacidade = " + capacidade + "\n";
        for (int i=0; i < ocupacao; i++)
            s += vetor[i] + " ";
        return s;
    }
    public void esvaziaVetor () {
        ocupacao = 0;
    }
    public void bubbleSort () {
        for (int i=1; i<ocupacao; i++) {//número de varreduras
            for (int j=0; j<ocupacao-i; j++) { //j é posição, começa do 0
                if (vetor[j] > vetor[j+1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = temp;
                }
            }
        }
    }
    public int bubbleSortContador () {
        int cont=0;
        for (int i=1; i<ocupacao; i++) {//número de varreduras
            for (int j=0; j<ocupacao-i; j++) { //j é posição, começa do 0
                cont++;
                if (vetor[j] > vetor[j+1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = temp;
                }
            }
        }
        return cont;
    }
    public void bubbleSortMelhorado () {
        boolean trocou = true;
        for (int i=1; i<ocupacao && trocou; i++) {//número de varreduras
            trocou = false;
            for (int j=0; j<ocupacao-i; j++) { //j é posição, começa do 0
                if (vetor[j] > vetor[j+1]) {
                    trocou = true;
                    int temp = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = temp;
                }
            }
        }
    }
    public void insertion () {
        for (int i=1; i<ocupacao; i++) {
            int x = vetor[i];
            int j;
            for (j=i-1; j>=0 && vetor[j] > x; j--) {
                vetor[j+1] = vetor[j];
            }
            vetor[j+1] = x;
        }
    }
    public void preencheVetor () {
        Random random = new Random();
        for (int i=0; i<capacidade; i++) {
            vetor[i] = random.nextInt(capacidade * 10);
        }
        ocupacao = capacidade;
    }
    public boolean buscaLinear (int x) {
        for (int i=0; i<ocupacao; i++) {
            if (vetor[i] == x)
                return true;
        }
        return false;
    }
    public int buscaLinearContador (int x) {
        int cont = 0;
        for (int i=0; i<ocupacao; i++) {
            cont++;
            if (vetor[i] == x)
                return cont;
        }
        return cont;
    }
    public boolean buscaBinaria (int x) {
        int ini = 0, fim = ocupacao-1;
        while (ini <= fim) {
            int meio = (ini + fim) / 2;
            if (vetor[meio] == x) return true;
            if (x > vetor[meio]) ini = meio + 1;
            else fim = meio - 1;
        }
        return false;
    }
    public boolean buscaBinariaRec (int x, int ini, int fim) {
        if (fim < ini) return false;
        int meio = (ini + fim) / 2;
        if (x == vetor[meio]) return true;
        if (x < vetor[meio])
            return buscaBinariaRec(x, ini, meio-1);
        return buscaBinariaRec(x, meio + 1, fim);
    }
    public int buscaBinariaContador (int x) {
        int ini = 0, fim = ocupacao-1;
        int cont = 0;
        while (ini <= fim) {
            cont++;
            int meio = (ini + fim) / 2;
            if (vetor[meio] == x) return cont;
            if (x > vetor[meio]) ini = meio + 1;
            else fim = meio - 1;
        }
        return cont;
    }
    private int partition(int p, int r) { 
        int x = vetor[r];     /* O pivô é o último elemento do vetor */
        int i = p-1;
        int aux;
        for(int j = p; j < r; j++) {
            if (vetor[j] <= x) {
                i = i + 1;
                aux = vetor[i];
                vetor[i] = vetor[j]; 
                vetor[j] = aux;
            }
        }
        i = i + 1;
        aux = vetor[r]; 
        vetor[r] = vetor[i]; 
        vetor[i] = aux;
        return i;
    }
    public void quicksort(int p, int r) {
        //System.out.printf ("p = %d, r = %d\n", p, r);
        if (p < r) {
            int q = partition(p, r);
            //System.out.printf("q = %d\n", q);
            quicksort(p, q-1);
            quicksort(q+1, r);
        }
    }
    public void mergesort (int p, int r) {
        if (p<r) {
            int q = (p + r) / 2;
            mergesort(p, q);
            mergesort(q+1, r);
            merge (p, q, r);
        }
    }
    private void merge (int p, int q, int r) {
        int tamLeft = q - p + 1 + 1; //precisa de uma posição extra
        int tamRight = r - (q+1) + 1 + 1; //precisa da posição extra
        int[] left = new int[tamLeft]; //duplicando a ocupação em memória
        int[] right = new int[tamRight];
        int i, j;
        //cópia da parte esquerda
        for (i=0; i<tamLeft-1; i++)
            left[i] = vetor[p+i];
        //cópia da parte direita
        for (j=0; j<tamRight-1; j++)
            right[j] = vetor[q+1+j];
        //sentinelas de cada parte = maior inteiro possível
        left[tamLeft-1] = 2147483647;
        right[tamRight-1] = 2147483647;
        i = 0;
        j = 0;
        for (int k=p; k <= r; k++) {
            if (left[i] <= right[j]) {
                vetor[k] = left[i++];
            }
            else {
                vetor[k] =right[j++];
            }
        }
    }
}