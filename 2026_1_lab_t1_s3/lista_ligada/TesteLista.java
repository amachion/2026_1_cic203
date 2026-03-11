public class TesteLista {
    public static void main(String[] args) {
        ListaLigada l = new ListaLigada();
        System.out.println("lista inicializada: " + l);
        l.insereInicio(8);
        l.insereInicio(25);
        l.insereInicio(14);
        l.insereInicio(30);
        System.out.println("lista depois das insercoes de inicio: " + l);
        if (l.estaVazia()) {
            System.out.println("lista vazia, nao ha o que remover!");
        }
        else {
            System.out.println(l.removeInicio() + " foi removido do inicio");
            System.out.println("a lista ficou assim: " + l);
        }
        l.insereFim(10);
        l.insereFim(20);
        l.insereFim(30);
        System.out.println("lista depois das insercoes de fim: " + l);
        if (l.estaVazia()) {
            System.out.println("lista vazia, nao há o que remover");
        }
        else {
            System.out.println(l.removeFim() + " foi removido do final");
            System.out.println("a lista ficou assim: " + l);
        }
    }
}
