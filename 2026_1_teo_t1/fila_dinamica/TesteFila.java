public class TesteFila {
    public static void main(String[] args) {
        Fila<Pessoa> f = new Fila<>();
        f.enfileira(new Pessoa("Ana", 2002));
        f.enfileira(new Pessoa("Bia", 2001));
        f.enfileira(new Pessoa("Caio", 2002));
        System.out.println(f);
        System.out.println(f.desenfileira() + " foi atendido");
        System.out.println(f);
    }
}
