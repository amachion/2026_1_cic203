import java.util.Random;

public class TesteArvore {
    public static void main(String[] args) {
        Random random = new Random();
        ABB abb = new ABB();
        System.out.println("sequencia gerada:");
        for (int i=1; i <= 10; i++) {
            int n = random.nextInt(20) + 1;
            abb.insere(n);
            System.out.print(n + " ");
        }
        System.out.println("\nSequencia inserida na abb, lida pelo percurso em ordem:");
        System.out.println(abb);
        int x = random.nextInt(20) + 1;
        if (abb.busca(x)) 
            System.out.println(x + " foi encontrado");
        else 
            System.out.println(x + " nao foi encontrado");
        Resposta r = abb.buscaDidatica(x);
        if (r.getAchou()) {
            System.out.println(x + " encontrado com " + r.getContador() + " buscas");
        }
        else {
            System.out.println(x + " nao encontrado com " + r.getContador() + " buscas");
        }
        System.out.println("a arvore tem " + abb.contaNos() + " nos");
        System.out.println("altura da arvore: " + abb.alturaArvore());
    }
}
