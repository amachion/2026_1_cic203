public class TestePilha {
    public static void main(String[] args) {
        Pilha p = new Pilha(5);
        System.out.println("pilha depois do construtor:\n" + p);
        p.empilha(10);
        p.empilha(20);
        p.empilha(30);
        System.out.println("pilha depois dos empilhamentos\n" + p);
        if (!p.pilhaVazia()) {
            System.out.println(p.desempilha() + " foi desempilhado");
            System.out.println("pilha depois do desempilhamento:\n" + p);
        }
    }
}
