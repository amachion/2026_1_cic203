public class ABB {
    private No raiz;
    //construtor padrão
    public boolean arvoreVazia () {
        return raiz == null;
    }
    public void insere (int info) {
        No novo = new No(info);
        if (arvoreVazia())
            raiz = novo;
        else 
            insereRec (novo, raiz);
    }
    private void insereRec (No novo, No atual) {
        if (novo.getInfo() > atual.getInfo()) { //vai para direita
            if (atual.getDireita() == null)  //posição disponível
                atual.setDireita(novo);
            else
                insereRec(novo, atual.getDireita()); //continua procurando
        }
        else { //vai para esquerda
            if (atual.getEsquerda() == null) 
                atual.setEsquerda(novo);
            else
                insereRec(novo, atual.getEsquerda());
        }
    }
    public String toString () { //percurso em ordem
        if (arvoreVazia())
            return "arvore vazia";
        return toStringRec1 (raiz);
    }
    private String toStringRec1 (No atual) {
        String s = "";
        if (atual.getEsquerda() != null)
            s += toStringRec1(atual.getEsquerda());
        s += atual + " ";
        if (atual.getDireita() != null)
            s += toStringRec1(atual.getDireita());
        return s;
    }
    private String toStringRec2 (No atual) {
        if (atual == null)
            return "";
        String s = "";
        s += toStringRec2(atual.getEsquerda());
        s += atual + " ";
        s += toStringRec2(atual.getDireita());
        return s;
    }
    public int contaNos () {
        return contaNosRec(raiz);
    }
    private int contaNosRec (No atual) {
        if (atual == null) return 0;
        return contaNosRec(atual.getEsquerda()) + contaNosRec(atual.getDireita()) + 1;
    }
    public int altura () {
        if (arvoreVazia()) return 0;
        return alturaRec(raiz);
    }
    private int alturaRec (No atual) {
        if (atual == null ||
        atual.getDireita() == null && atual.getEsquerda() == null) return 0;
        int alturaEsquerda = alturaRec(atual.getEsquerda());
        int alturaDireita = alturaRec(atual.getDireita());
        return alturaDireita > alturaEsquerda ? alturaDireita + 1 : alturaEsquerda + 1;
    }
}
