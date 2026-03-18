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
    public int removeInicio () {
        int temp = primeiro.getInfo();
        primeiro = (NoDuplo)primeiro.getProximo();//coersão
        if (primeiro == null) //tinha um só, a lista ficou vazia
            ultimo = null;
        else
            primeiro.setAnterior(null);
        tamanho--;
        return temp;
    }
    public int removeFim () {
        int temp = ultimo.getInfo();
        ultimo = (NoDuplo)ultimo.getAnterior();//coersão
        if (ultimo == null)
            primeiro = null;
        else
            ultimo.setProximo(null);
        tamanho--;
        return temp;
    }
    public void insereNaPosicao (int info, int posicao) {
        if (posicao < 1 || posicao > tamanho)
            throw new IndexOutOfBoundsException();
        if (posicao == 1)
            insereInicio(info);
        else {
            NoDuplo runner = primeiro;
            int cont = 1;
            while (cont < posicao) {
                cont++;
                runner = (NoDuplo)runner.getProximo();
            }
            NoDuplo novo = new NoDuplo(info);
            novo.setProximo(runner);
            novo.setAnterior(runner.getAnterior());
            ((NoDuplo)novo.getProximo()).setAnterior(novo);
            novo.getAnterior().setProximo(novo);
            tamanho++;
        }
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
