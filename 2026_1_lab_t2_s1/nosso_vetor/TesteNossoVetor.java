public class TesteNossoVetor {
    public static void main(String[] args) {
        NossoVetor v1 = new NossoVetor(5);
        NossoVetor v2 = new NossoVetor(4);
        v1.adiciona(100);
        v2.adiciona(200);
        int i = 10;
        // while (!v1.estaCheio()) {
        //     v1.adiciona(i);
        //     i += 10;
        //     System.out.println(v1);
        // }
        // while (v2.adiciona(i)) {
        //     i += 10;
        //     System.out.println(v2);
        // }
        while (i <= 100) {
            v1.adiciona(i++);
            System.out.println(v1);
        }



        while (v1.remove() != -1) {
            System.out.println(v1);
        }
        while (!v2.estaVazio2()) {
            System.out.println(v2.remove() + " foi removido");
            System.out.println(v2);
        }
    }
}
