public class TestePilha {
    public static void main(String[] args) {
        Pilha p = new Pilha();
        p.empilha('a');
        p.empilha('b');
        p.empilha('c');
        p.empilha('d');
        System.out.println("pilha depois dos empilhamentos");
        System.out.println(p);
        if (!p.estaVazia())
            System.out.println(p.desempilha() + " foi desempilhado");
        System.out.println("pilha depois do desempilhamento");
        System.out.println(p);
    }
}
