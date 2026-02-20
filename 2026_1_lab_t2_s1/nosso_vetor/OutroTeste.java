public class OutroTeste {
    public static void main(String[] args) {
        NossoVetor v = new NossoVetor();
        v.adiciona(2);
        v.adiciona(10);
        v.adiciona(2);
        v.adiciona(10);
        v.adiciona(2);
        v.adiciona(10);
        System.out.println(v.listaPosicoes(10));
    }
}
