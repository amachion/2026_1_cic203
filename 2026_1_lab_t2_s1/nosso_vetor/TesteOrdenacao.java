import java.util.Calendar;
import java.util.Scanner;

public class TesteOrdenacao {
    public static void main(String[] args) {
        NossoVetor v;
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite o tamanho do vetor, 0 encerra: ");
        int capacidade = scanner.nextInt();
        while (capacidade > 0) {
            v = new NossoVetor(capacidade);
            //---------------------------------------------------------
            //v.preencheVetor();
            //System.out.println(v);
            //long ini = Calendar.getInstance().getTimeInMillis();
            //v.insertion();
            //long fim = Calendar.getInstance().getTimeInMillis();
            //System.out.println(v);
            //System.out.println("insertion\ncapacidade: " + capacidade + "\ntempo: " + (fim - ini) + " ms");
            //----------------------------------------------------------
            v.preencheVetor();
            //System.out.println(v);
            long ini = Calendar.getInstance().getTimeInMillis();
            v.quicksort(0, capacidade-1);
            long fim = Calendar.getInstance().getTimeInMillis();
            //System.out.println(v);
            System.out.println("quicksort\ncapacidade: " + capacidade + "\ntempo: " + (fim - ini) + " ms");
            //--------------------------------------------------------
            ini = Calendar.getInstance().getTimeInMillis();
            v.quicksort(0, capacidade-1);
            fim = Calendar.getInstance().getTimeInMillis();
            //System.out.println(v);
            System.out.println("quicksort ordenado\ncapacidade: " + capacidade + "\ntempo: " + (fim - ini) + " ms");
            //---------------------------------------------------------
            System.out.print("\ndigite a nova capacidade, 0 encerra: ");
            capacidade = scanner.nextInt();
        }
        scanner.close();
    }
}
