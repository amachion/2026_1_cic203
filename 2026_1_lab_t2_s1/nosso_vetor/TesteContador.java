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
            System.out.print("digite valor para busca: ");
            int x = scanner.nextInt();
            System.out.println("busca linear realizou " + v.buscaLinearContador(x) + " comparacoes");
            System.out.println("bubble realizou " + v.bubbleSortContador() + " comparacoes");
            //System.out.println(v);
            System.out.println("busca binaria realizou " + v.buscaBinariaContador(x) + " comparacoes");
            System.out.print("\ndigite o tamanho do vetor, 0 encerra: ");
            capacidade = scanner.nextInt();  
        }
        scanner.close();
    }
}
