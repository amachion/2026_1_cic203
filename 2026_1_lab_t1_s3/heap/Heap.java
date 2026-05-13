public class Heap {
    private int[] a;
    private int n;
    
    public Heap (int[] a) {
        this.a = new int[a.length + 1];
        n = a.length;
        for (int i=1; i<=n; i++)
            this.a[i] = a[i-1];
        constroiHeap();
    }
    int pai (int i) {
        return i / 2;
    }
    int esquerda (int i) {
        return 2 * i;
    }
    int direita (int i) {
        return 2 * i + 1;
    }
    void desceHeap (int i, int n) { //i é a posição que vai ser ajustada
        while (2 * i <= n) { //pos i tem filhos
            int f = esquerda(i); //olha o filho da esquerda
            if (f < n && a[f+1] > a[f])
            //verifica se tem filho da direita e ele é maior
                f++; //significa que o maior é o da direita
            if (a[i] < a[f]) {//se o pai é menor, troca
                int aux = a[i];
                a[i] = a[f];
                a[f] = aux;
                i = f;//vai olhar a nova configuração do elemento que desceu
            }
            else 
                break; //se não houve troca, sai do laço
        }
    }
    void constroiHeap () {
        for (int i = n/2; i > 0; i--)
            desceHeap(i, n);
    }
    public void heapSort () {
        //constroiHeap ();
        int tamanho = n;
        for (int i=tamanho; i>=2; i--) {
            int aux = a[1];
            a[1] = a[i];
            a[i] = aux;
            tamanho--;
            desceHeap(1, tamanho);
        }
    }
    @Override
    public String toString () {
        String s = "";
        for (int i = 1; i <= n; i++)
            s += a[i] + " ";
        return s;
    }
}
