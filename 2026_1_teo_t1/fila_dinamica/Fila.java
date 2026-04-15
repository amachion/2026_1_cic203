public class Fila <T> {
    private No<T> primeiro;
    private No<T> ultimo;
    //construtor padrão
    public boolean estaVazia() {
        return primeiro == null;
    }
    public void enfileira (T info) {
        No<T> novo = new No<>(info);
        if (estaVazia()) {
            primeiro = novo;
        }
        else {
            ultimo.setProximo(novo);
        }
        ultimo = novo;
    } 
    public T desenfileira () {
        if (estaVazia()) return null;
        T temp = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        if (primeiro == null) { //esvaziou a fila
            ultimo = null;
        }
        return temp;
    }
    public No<T> peek () {
        return primeiro;
    }
    @Override
    public String toString () {
        if (estaVazia()) return "fila vazia";
        String s = "";
        No<T> atual = primeiro;
        while (atual != null) {
            s += atual + "->";
            atual = atual.getProximo();
        }
        return s + "//";
    }
}
