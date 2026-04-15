//teste automático: laço para gerar valores 0 / 1, 0 desenfileira e 1 enfileira, até esvaziara a fila; quando enfileirar, gerar randômicos de 0 a 9 e mostrar a fila, quando desifileirar, mostrar quem foi atendido e a fila

import java.util.Random;

public class TesteFila {
    public static void main(String[] args) {
        Random random = new Random();
        Fila f = new Fila(6);
        try {
            do {
                if (random.nextInt(2) == 1) {
                    if (!f.estaCheia()) {
                        f.enfileira(random.nextInt(10));
                        System.out.println(f);
                    }
                    else {
                        System.out.println("fila cheia, nao deu para enfileirar");
                    }
                }
                else {
                    System.out.println(f.desenfileira() + " foi atendido");
                    System.out.println(f);
                }
            } while (!f.estaVazia());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
