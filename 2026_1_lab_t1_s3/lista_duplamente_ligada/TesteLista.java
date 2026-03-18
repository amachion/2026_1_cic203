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
    }
}
