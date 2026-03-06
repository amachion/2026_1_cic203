import java.util.Calendar;
import java.util.Scanner;

public class TesteBubble {
    public static void main(String[] args) {
        NossoVetor v;
        int t;
        Scanner scanner = new Scanner(System.in);
        System.out.print("\ndigite o tamanho do vetor (0 encerra): ");
        t = scanner.nextInt();
        while (t > 0) {
            v = new NossoVetor(t);
            v.preencheVetor();
            //System.out.println(v);
            System.out.println("ordenando pelo Bubble ...");
            long inicio = Calendar.getInstance().getTimeInMillis();
            v.bubbleSort();
            long fim = Calendar.getInstance().getTimeInMillis();
            System.out.println("\nBubble\ntamanho: " + t + ", tempo: " + (fim-inicio) + " ms");
            //System.out.println(v);

            // inicio = Calendar.getInstance().getTimeInMillis();
            // v.bubbleSortMelhorado();
            // fim = Calendar.getInstance().getTimeInMillis();
            // System.out.println("Bubble melhorado\ntamanho: " + t + ", tempo: " + (fim - inicio) + " ms");

            //teste ordenação pelo insertion
            v.preencheVetor();
            //System.out.println(v);
            System.out.println("\nordenando pelo insertion ...");
            inicio = Calendar.getInstance().getTimeInMillis();
            v.insertion();
            fim = Calendar.getInstance().getTimeInMillis();
            System.out.println("\nInsertion\ntamanho: " + t + ", tempo: " + (fim-inicio) + " ms");
            //System.out.println(v);
           
            System.out.println("\nordenando pelo insertion o vetor ordenado...");
            inicio = Calendar.getInstance().getTimeInMillis();
            v.insertion();
            fim = Calendar.getInstance().getTimeInMillis();
            System.out.println("\nInsertion\ntamanho: " + t + ", tempo: " + (fim-inicio) + " ms");

            System.out.print("\ndigite o tamanho do novo vetor (0 encerra): ");
            t = scanner.nextInt();
        }
        scanner.close();
    }
}
