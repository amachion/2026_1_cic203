public class ListaLigada {
    private No primeiro;
    //construtor padrão, só por clareza
    public ListaLigada() {
        primeiro = null;
    }
    public boolean estaVazia() {
        return primeiro == null;
    }
    public void insereInicio (int info) {
        No novo = new No(info);
        if (!estaVazia())
            novo.setProximo(primeiro);
        primeiro = novo;
    }
    public void insereFim (int info) {
        No novo = new No(info);
        if (estaVazia()) primeiro = novo;
        else {
            No runner = primeiro;
            while (runner.getProximo() != null) //percorre até o último
                runner = runner.getProximo();
            runner.setProximo(novo);
        }
    }
    public int removeInicio () {
        //teste de vazia fica para aplicação
        int temp = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        return temp;
    }
    public int removeFim () {
        //teste de vazia fica na aplicação
        int temp;
        if (primeiro.getProximo() == null) {
            //cenário 1: a lista tem um único elemento
            temp = primeiro.getInfo();
            primeiro = null;
        }
        else {
            //cenário 2: a lista tem pelo menos 2 elementos
            No runner = primeiro;
            while (runner.getProximo().getProximo() != null) //percorre até o penúltimo
                runner = runner.getProximo();
            temp = runner.getProximo().getInfo();
            runner.setProximo(null);
        }
        return temp;
    }
    public int get(int index) {
        if (index <= 0) return -1;
        int pos_atual = 1;
        No runner = primeiro;
        while (runner != null && pos_atual < index) {
            pos_atual++;
            runner = runner.getProximo();
        }
        if (runner == null) //index > tamanho
            return -1;
        return runner.getInfo(); //achei a posição

    }
    @Override 
    public String toString() {
        if (estaVazia()) return ("lista vazia");
        No runner = primeiro;
        String s = "";
        while (runner != null) { //percorre a lista até o final
            s = s + runner.toString();
            runner = runner.getProximo();
        }
        return s + "//";
    }
}

