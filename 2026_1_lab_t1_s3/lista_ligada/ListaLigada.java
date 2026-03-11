public class ListaLigada {
    private No primeiro;
    public ListaLigada() {
        primeiro = null;
    }
    public boolean estaVazia() {
        return primeiro == null;
    }
    public void insereInicio (int info) {
        No novo = new No(info);
        if (!estaVazia()) {
            novo.setProximo(primeiro);
        }
        primeiro = novo;
    }
    public int removeInicio () {
        //teste de vazia vai ficar na aplicação
        int temp = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        return temp;
    }
    public void insereFim(int info) {
        No novo = new No(info);
        if (estaVazia()) {
            primeiro = novo;
        }
        else {
            No runner = primeiro;
            while (runner.getProximo() != null) { //percorrer até o último
                runner = runner.getProximo();
            }
            runner.setProximo(novo);
        }
    }
    public int removeFim() {
        //teste de vazia está na aplicação
        //cenário 1: a lista tem um único elemento
        if (primeiro.getProximo() == null) {
            int temp = primeiro.getInfo();
            primeiro = null; //lista fica vazia
            return temp;
        }
        //cenário 2: a lista tem pelo menos 2 elementos
        No runner = primeiro;
        while (runner.getProximo().getProximo() != null) {
            runner = runner.getProximo();
        }
        int temp = runner.getProximo().getInfo();
        runner.setProximo(null);
        return temp;
    }

    @Override
    public String toString () {
        if (estaVazia()) return "lista vazia";
        String s = "";
        No runner = primeiro;
        while (runner != null) {  //percorre a lita até o final
            s += runner.toString();
            runner = runner.getProximo();
        }
        return s + "//";
    }
}
