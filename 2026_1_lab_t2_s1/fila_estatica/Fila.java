public class Fila {
    private int[] dados;
    private int primeiro, ultimo, ocupacao, capacidade;

    public Fila(int capacidade) {
        dados = new int[capacidade];
        primeiro = 0; // por clareza
        ultimo = 0;
        ocupacao = 0;
        this.capacidade = capacidade;
    }

    public boolean estaVazia() {
        return ocupacao == 0;
    }

    public boolean estaCheia() {
        return ocupacao == capacidade;
    }

    private int proximaPos(int pos) {
        return (pos + 1) % capacidade;
    }

    public boolean enfileira(int elemento) {
        if (estaCheia())
            return false;
        dados[ultimo] = elemento;
        ultimo = proximaPos(ultimo);
        ocupacao++;
        return true;
    }

    public int desenfileira() throws Exception {
        if (estaVazia())
            throw new FilaVaziaException();
        int temp = dados[primeiro];
        primeiro = proximaPos(primeiro);
        ocupacao--;
        return temp;
    }

    @Override
    public String toString() { // didática
        if (estaVazia())
            return "fila vazia";
        String s = "";
        // for (int i=primeiro; i<ultimo; i = proximaPos(i))
        // falha quando a fila está cheia
        int i = primeiro;
        do {
            s = s + dados[i] + " ";
            i = proximaPos(i);
        } while (i != ultimo);
        return s;
    }
    public void mostraVetor () {
        if (estaVazia())
            System.out.println("_ _ _ _ _ _ _ _");
        else if (estaCheia()) {
            for (int i=0; i<dados.length; i++)
                System.out.print(dados[i] + " ");
            System.out.println();
        }
        else if (primeiro < ultimo) {
            for (int i=0; i<primeiro; i++)
                System.out.print("_ ");
            for (int i=primeiro; i<ultimo; i++)
                System.out.print(dados[i] + " ");
            for (int i=ultimo; i<dados.length; i++)
                System.out.print("_ ");
            System.out.println();
        }
        else {
            for (int i=0; i<ultimo; i++)
                System.out.print(dados[i] + " ");
            for (int i=ultimo; i<primeiro; i++)
                System.out.print ("_ ");
            for (int i=primeiro; i<dados.length; i++)
                System.out.print (dados[i] + " ");
            System.out.println();
        }
    }
}

class FilaVaziaException extends Exception {
    public FilaVaziaException() {
        super("Fila esta vazia");
    }
}