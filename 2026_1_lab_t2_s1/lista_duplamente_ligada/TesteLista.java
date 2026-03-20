public class TesteLista {
    public static void main(String[] args) {
        ListaDupla lista = new ListaDupla();
        try {
            System.out.println("lista foi instanciada: " + lista);
            //System.out.println(lista.removeInicio());
            lista.insereInicio(10);
            lista.insereInicio(20);
            lista.insereInicio(30);
            System.out.println("lista depois das insecoes de inicio:\n" + lista);
            lista.insereFim(15);
            lista.insereFim(25);
            lista.insereFim(35);
            System.out.println("lista depois das insercoes de fim:\n" + lista);
            System.out.println(lista.removeInicio() + " foi removido do inicio");
            System.out.println("lista depois da remocao de inicio:\n" + lista);
            System.out.println(lista.removeFim() + " foi removido do fim");
            System.out.println("lista depois da remocao de fim:\n" + lista);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
