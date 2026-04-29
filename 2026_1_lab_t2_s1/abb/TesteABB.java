import java.util.Random;

public class TesteABB {
    public static void main(String[] args) {
        Random random = new Random();
        ABB abb = new ABB();
        for (int i=1; i<=5000; i++) {
            int n = random.nextInt(10000);
            //System.out.print(n + " ");
            abb.insere(n);
        }
        //System.out.println("\n\n" + abb);
        System.out.println("a arvore tem " + abb.contaNos() + " nos");
        System.out.println("altura = " + abb.altura());
    }
}
