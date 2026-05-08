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
    public boolean remove (int info) {
        if (arvoreVazia()) return false;
        if (info == raiz.getInfo()) {
            if (raiz.getEsquerda() == null && raiz.getDireita() == null) {//raiz não tem filhos
                raiz = null;
                return true;
            }
            if (raiz.getDireita() == null) {//só tem filhos na esquerda
                raiz = raiz.getEsquerda();
                return true;
            }
            if (raiz.getEsquerda() == null) {//só tem filhos na direita
                raiz = raiz.getDireita();
                return true;
            }
            //a raiz tem 2 filhos
            No suc = sucessor(raiz);
            suc.setEsquerda(raiz.getEsquerda());
            raiz = suc;
            return true;
        }
        else {
            if (info > raiz.getInfo())
                return removeRec (info, raiz.getDireita(), raiz, true);
            else
                return removeRec (info, raiz.getEsquerda(), raiz, false);
        }
    }
    private boolean removeRec (int info, No atual, No pai, boolean eFilhoDireita) {
        if (atual == null) return false; //info não existe na árvore
        if (info == atual.getInfo()) {
            if (atual.getDireita() == null && atual.getEsquerda() == null) {//atual não tem filhos
                if (eFilhoDireita) {
                    pai.setDireita(null);
                }
                else {
                    pai.setEsquerda(null);
                }
            }
            else if (atual.getDireita() == null) {//só tem filho da esquerda
                if (eFilhoDireita) {
                    pai.setDireita(atual.getEsquerda());
                }
                else {
                    pai.setEsquerda(atual.getEsquerda());
                }
            }
            else if (atual.getEsquerda() == null) {//só tem filho da direita
                if (eFilhoDireita) {
                    pai.setDireita(atual.getDireita());
                }
                else {
                    pai.setEsquerda(atual.getDireita());
                }
            }
            else {//tem 2 filhos
                No suc = sucessor(atual);
                suc.setEsquerda(atual.getEsquerda());
                if (eFilhoDireita) {
                    pai.setDireita(suc);
                }
                else {
                    pai.setEsquerda(suc);
                }
            }
            return true;
        }
        else if (info > atual.getInfo()) {
            return removeRec(info, atual.getDireita(), atual, true);
        }
        else {
            return removeRec(info, atual.getEsquerda(), atual, false);
        }
    }

    private No sucessor (No atual) {
        No pai = atual;
        No suc = atual.getDireita();
        No runner = suc.getEsquerda();
        while (runner != null) {
            pai = suc;
            suc = runner;
            runner = runner.getEsquerda();
        }
        if (suc != atual.getDireita()) {
            pai.setEsquerda(suc.getDireita());
            suc.setDireita(atual.getDireita());
        }
        return suc;
    }
}
