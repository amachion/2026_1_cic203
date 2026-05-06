public class ABB {
    private No raiz;
    //construtor padrão
    public boolean arvoreVazia() {
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
            if (atual.getDireita() == null) //direita está disponível
                atual.setDireita(novo);
            else 
                insereRec(novo, atual.getDireita());
        }
        else { //vai para esquerda
            if (atual.getEsquerda() == null) //esquerda está disponível
                atual.setEsquerda(novo);
            else
                insereRec(novo, atual.getEsquerda());
        }
    }
    @Override
    public String toString () {
        if (arvoreVazia())
            return "arvore vazia";
        return toStringRec(raiz);
    }
    public int contaNos () {
        if (arvoreVazia())
            return 0;
        return contaNosRec(raiz);
    }
    private String toStringRec(No atual) {
        String s = "";
        if (atual.getEsquerda() != null)
            s += toStringRec(atual.getEsquerda());
        s += atual + "";
        if (atual.getDireita() != null)
            s += toStringRec(atual.getDireita());
        return s;
    }
    private int contaNosRec (No atual) {
        int cont = 0;
        if (atual.getEsquerda() != null)
            cont += contaNosRec(atual.getEsquerda());
        if (atual.getDireita() != null)
            cont += contaNosRec(atual.getDireita());
        return cont + 1; //contar a posição atual
    }
    public boolean busca (int info) {
        if (arvoreVazia())
            return false;
        return buscaRec (info, raiz);
    }
    public Resposta buscaDidatica (int info) {
        Resposta resposta = new Resposta();
        if (arvoreVazia())
            return resposta;
        return buscaRecDidatica (info, raiz, resposta);
    }
    private boolean buscaRec (int info, No atual) {
        if (info == atual.getInfo())
            return true;
        if (info > atual.getInfo()) { //buscar na direita
            if (atual.getDireita() != null) //garantir que a sub-direita existe
                return buscaRec(info, atual.getDireita());
            return false;
        }
        else { //buscar na esquerda
            if (atual.getEsquerda() != null) //garantir que a sub-esquerda existe
                return buscaRec(info, atual.getEsquerda());
            return false;
        }
    }
    private Resposta buscaRecDidatica (int info, No atual, Resposta resposta) {
        resposta.incrementaContador();
        if (info == atual.getInfo()) {
            resposta.setAchou(true);
            return resposta;
        }
        else if (info > atual.getInfo()) { //buscar na direita
            if (atual.getDireita() != null) //garantir que a sub-direita existe
                return buscaRecDidatica(info, atual.getDireita(), resposta);
        }
        else { //buscar na esquerda
            if (atual.getEsquerda() != null) //garantir que a sub-esquerda existe
                return buscaRecDidatica(info, atual.getEsquerda(), resposta);
        }
        return resposta;
    }
    public int alturaArvore () {
        if (arvoreVazia())
            return 0;
        return alturaRec (raiz);
    }
    private int alturaRec (No atual) {
        if (atual.getEsquerda() == null && atual.getDireita() == null) //nó folha
            return 0;
        int alturaEsq=0, alturaDir=0;
        if (atual.getEsquerda() != null)
            alturaEsq = alturaRec(atual.getEsquerda());
        if (atual.getDireita() != null)
            alturaDir = alturaRec(atual.getDireita());
        return alturaEsq > alturaDir ? alturaEsq + 1 : alturaDir + 1;
    }
    //remoção de um nó
    public boolean remove (int info) {
        if (arvoreVazia()) return false;
        if (info == raiz.getInfo()) {
            if (raiz.getEsquerda() == null && raiz.getDireita() == null) {//raiz não tem filhos
                raiz = null;
                return true;
            }
            if (raiz.getEsquerda() == null) {//só tem a sub-árvore da direita
                raiz = raiz.getDireita();
                return true;
            }
            if (raiz.getDireita() == null) {//só tem a sub-árvore da esquerda
                raiz = raiz.getEsquerda();
                return true;
            }
            //a raiz tem 2 filhos
            No suc = sucessor(raiz);
            suc.setEsquerda(raiz.getEsquerda());
            raiz = suc;
        }
        else {
            if (info > raiz.getInfo())
                return removeRec (info, raiz.getDireita(), raiz, true);
            return removeRec (info, raiz.getEsquerda(), raiz, false);
        }
    }
    private boolean removeRec (int info, No atual, No pai, boolean eFilhoDireita) {
        if (atual == null) return false;
        if (info == atual.getInfo()) {
            if (atual.getDireita() == null && atual.getEsquerda() == null) { //nó atual não tem filhos
                if (eFilhoDireita)
                    pai.setDireita(null);
                else
                    pai.setEsquerda(null);
                return true;
            }
            if (atual.getDireita() == null) { //só tem filho da esquerda
                if (eFilhoDireita)
                    pai.setDireita(atual.getEsquerda());
                else
                    pai.setEsquerda(atual.getEsquerda());
                return true;
            }
            if (atual.getEsquerda() == null) { //só tem filho da direita
                if (eFilhoDireita)
                    pai.setDireita(atual.getDireita());
                else
                    pai.setEsquerda(atual.getDireita());
                return true;
            }
            //nó atual tem 2 filhos
            No suc = sucessor(atual);
            suc.setEsquerda(atual.getEsquerda());
            if (eFilhoDireita)
                pai.setDireita(suc);
            else
                pai.setEsquerda(suc);
            return true;
        }
        if (info > atual.getInfo())
            return removeRec(info, atual.getDireita(), atual, true);
        return removeRec(info, atual.getEsquerda(), atual, false);
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
