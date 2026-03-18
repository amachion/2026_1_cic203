public class ListaDupla {
    private NoDuplo primeiro;
    private NoDuplo ultimo;
    private int tamanho;
    //construtor padrão
    public int getTamanho () {
        return tamanho;
    }
    public boolean estaVazia() {
        return primeiro == null;
    }
    public void insereInicio (int info) {
        NoDuplo novo = new NoDuplo(info);
        if (estaVazia()) {
            ultimo = novo;
        }
        else {
            novo.setProximo(primeiro);
            primeiro.setAnterior(novo);
        }
        primeiro = novo;
        tamanho++;
    }
    public void insereFim (int info) {
        NoDuplo novo = new NoDuplo(info);
        if (estaVazia()) {
            primeiro = novo;
        }
        else {
            novo.setAnterior(ultimo);
            ultimo.setProximo(novo);
        }
        ultimo = novo;
        tamanho++;
    }
    @Override
    public String toString () {
        if (estaVazia())
            return "lista vazia";
        String s = "//";
        No runner = primeiro;
        while (runner != null) {
            s += "=" + runner.toString() + "=";
            runner = runner.getProximo();
        }
        return s + "//";
    }
}
