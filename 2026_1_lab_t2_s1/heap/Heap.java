public class Heap {
    int[] a;
    int capacidade;
    public Heap (int capacidade) {
        a = new int[capacidade + 1];
        this.capacidade = capacidade;
    }
    public Heap (int[] a) {
        this.a = new int[a.length + 1];
        this.capacidade = a.length;
        for (int i=1; i<=capacidade; i++)
            this.a[i] = a[i-1];
        constroiHeap();
    }
    int pai (int i) {
        return i/2;
    }
    int esquerda (int i) {
        return 2 * i;
    }
    int direita (int i) {
        return 2 * i + 1;
    }
    void desceHeap (int i, int n) {
        while (2*i <= n) {
            int f = esquerda(i);
            if (f < n && a[direita(i)] > a[f]) {
                f = direita(i);
            }
            if (a[f] > a[i]) {
                int aux = a[i];
                a[i] = a[f];
                a[f] = aux;
                i = f;
            }
            else {
                break; //encerra o laço
            }
        }
    }
    void constroiHeap () {
        for (int i=capacidade/2; i >= 1; i--) {
            desceHeap(i, capacidade);
        }
    }
    @Override 
    public String toString () {
        String s = "";
        for (int i=1; i<=capacidade; i++) {
            s += a[i] + " ";
        }
        return s;
    }
    public void heapSort () {
        int tamanho = capacidade;
        for (int i=capacidade; i >= 2; i--) {
            //jogar o maior para a última posição a ser considerada
            int aux = a[1];
            a[1] = a[i];
            a[i] = aux;
            tamanho--;
            desceHeap(1, tamanho);
        }
    }
}