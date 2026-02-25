public class OutroTeste {
    public static void main(String[] args) {
        NossoVetor v = new NossoVetor(6);
        System.out.println(v);
        for (int i=1; i<=100; i++) {
            v.adiciona(i);
            System.out.println(v);
        }
        while (!v.estaVazio3()) {
            System.out.println(v.removeUltimo() + " saiu");
            System.out.println(v);
        }
    }
}
