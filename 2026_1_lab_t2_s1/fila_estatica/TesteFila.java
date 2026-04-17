import java.util.Random;

public class TesteFila {
    public static void main(String[] args) {
        Fila fila = new Fila(8);
        Random random = new Random();
        do {
            if (random.nextBoolean()) { //tenta enfileirar
                if (fila.enfileira(random.nextInt(10))) {
                    System.out.println(fila);
                    fila.mostraVetor();
                }
                else {
                    System.out.println("fila esta cheia");
                }
            }
            else { //tentar desenfileirar
                try {
                    System.out.println(fila.desenfileira() + " foi atendido");
                    System.out.println(fila);
                    fila.mostraVetor();
                }
                catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        } while (!fila.estaVazia());
    }
}
