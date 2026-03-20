import java.util.NoSuchElementException;

public class ListaDupla {
    private NoDuplo primeiro;
    private NoDuplo ultimo;
    //construtor é o padrão
    public boolean listaVazia() {
        return primeiro == null;
    }
    public void insereInicio (int info) {
        NoDuplo novo = new NoDuplo(info);
        if (listaVazia()) {
            ultimo = novo;
        }
        else {
            novo.setProximo(primeiro);
            primeiro.setAnterior(novo);
        }
        primeiro = novo;
    }
    public int removeInicio () {
        if (listaVazia()) 
            throw new NoSuchElementException();
        int temp = primeiro.getInfo();
        primeiro = (NoDuplo)primeiro.getProximo();
        if (primeiro == null) { //esvaziou a lista
            ultimo = null;
        }
        else {
            primeiro.setAnterior(null);
        }
        return temp;
    }
    public void insereFim(int info) {
        NoDuplo novo = new NoDuplo(info);
        if (listaVazia()) {
            primeiro = novo;
        }
        else {
            novo.setAnterior(ultimo);
            ultimo.setProximo(novo);
        }
        ultimo = novo;
    }
    public int removeFim() {
        if (listaVazia())
            throw new NoSuchElementException();
        int temp = ultimo.getInfo();
        ultimo = (NoDuplo)ultimo.getAnterior();
        if (ultimo == null) { //esvaziou a lista
            primeiro = null;
        }
        else {
            ultimo.setProximo(null);
        }
        return temp;
    }
    @Override
    public String toString () {
        if (listaVazia()) return "lista vazia";
        NoDuplo runner = primeiro;
        String s = "//= ";
        while (runner != null) {
            s += runner.toString() + "= ";
            runner = (NoDuplo)runner.getProximo();
        }
        return s + "//";
    }

}
