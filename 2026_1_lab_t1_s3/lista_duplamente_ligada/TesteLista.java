public class TesteLista {
    public static void main(String[] args) {
        ListaDupla lista = new ListaDupla();
        System.out.println("lista depois da instanciacao: " + lista);
        lista.insereInicio(10);
        lista.insereInicio(20);
        lista.insereInicio(30);
        System.out.println("lista depois das insercoes de inicio:\n" + lista);
        lista.insereFim(15);
        lista.insereFim(25);
        lista.insereFim(35);
        System.out.println("lista depois das insercoes de fim:\n" + lista);
        if (!lista.estaVazia()) {
            System.out.println(lista.removeInicio() + " foi removido do inicio");
            System.out.println("lista depois da remocao de inicio:\n" + lista);
        }
        if (!lista.estaVazia()) {
            System.out.println(lista.removeFim() + " foi removido do final");
            System.out.println("lista depois da remocao de fim:\n" + lista);
        }
        lista.insereInicio(40);
        lista.insereInicio(50);
        lista.insereInicio(60);
        lista.insereFim(45);
        lista.insereFim(55);
        lista.insereFim(65);
        System.out.println("lista cheia:\n" + lista);
    }
}
