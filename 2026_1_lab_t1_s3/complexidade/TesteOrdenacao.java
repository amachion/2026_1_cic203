import java.util.Calendar;
import java.util.Scanner;

public class TesteOrdenacao {
    public static void main(String[] args) {
        NossoVetor v;
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite a capacidade do vetor, 0 encerra: ");
        int capacidade = scanner.nextInt();
        while (capacidade > 0) {
            v = new NossoVetor(capacidade);
            v.preencheVetor();
            //System.out.println(v);
            System.out.println("ordenando pelo bubble...");
            long inicio = Calendar.getInstance().getTimeInMillis();
            v.bubbleSort();
            long fim = Calendar.getInstance().getTimeInMillis();
            System.out.println("capacidade: " + capacidade + ", tempo bubble: " + (fim - inicio) + " ms");
            //System.out.println(v);
            //------------------------------------
            v.preencheVetor();
            //System.out.println(v);
            System.out.println("ordenando pelo insertion...");
            inicio = Calendar.getInstance().getTimeInMillis();
            v.insertionSort();
            fim = Calendar.getInstance().getTimeInMillis();
            System.out.println("capacidade: " + capacidade + ", tempo insertion: " + (fim - inicio) + " ms");
            //System.out.println(v);
            //-------------------------------------------
            //  * * * * * *
            //implementar e realizar testes com o selection sort
            //https://www.ime.usp.br/~pf/algoritmos/aulas/ordena.html
            System.out.print("digite a capacidade do vetor, 0 encerra: ");
            capacidade = scanner.nextInt();
        }
        scanner.close();
    }
}
