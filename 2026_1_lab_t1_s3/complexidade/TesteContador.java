import java.util.Scanner;

public class TesteContador {
    public static void main(String[] args) {
        NossoVetor v;
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite o tamanho do vetor, 0 encerra: ");
        int capacidade = scanner.nextInt();
        while (capacidade > 0) {
            v = new NossoVetor(capacidade);
            v.preencheVetor();
            //System.out.println(v);
            System.out.print("digite o elemento para busca: ");
            int x = scanner.nextInt();
            System.out.println("comparacoes da busca linear: " + v.buscaLinearContador(x));
            System.out.println("comparacoes do bubble: " + v.bubbleSortContador());
            System.out.println("comparacoes da busca binaria: " + v.buscaBinariaContador(x));
            System.out.print("\ndigite o tamanho do vetor, 0 encerra: ");
            capacidade = scanner.nextInt();
        }
        scanner.close();
    }
}
