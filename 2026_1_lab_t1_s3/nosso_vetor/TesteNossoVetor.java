public class TesteNossoVetor {
    public static void main(String[] args) {
        NossoVetor v1 = new NossoVetor();
        NossoVetor v2 = new NossoVetor(6);

        for (int i = 0; i < v2.getCapacidade(); i++) {
            v2.adiciona(i+3);
            System.out.println(v2);
        }

        v2.removeUltimo();
        System.out.println("Vetor depois da remocao: " + v2);
    }
}
