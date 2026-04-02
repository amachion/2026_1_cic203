import java.util.Calendar;
import java.util.Scanner;

public class ComparaQuickMerge {
    public static void main(String[] args) {
        NossoVetor v;
        Scanner sc = new Scanner(System.in);
        int capacidade;
        System.out.println("digite a capacidade, 0 encerra");
        capacidade = sc.nextInt();
        while (capacidade > 0) {
            v = new NossoVetor(capacidade);
            v.preencheVetor();
            //System.out.println(v);
            long ini = Calendar.getInstance().getTimeInMillis();
            v.quicksort(0, capacidade-1);
            long fim = Calendar.getInstance().getTimeInMillis();
            //System.out.println(v);
            System.out.println("quick: " + (fim - ini));
            v.preencheVetor();
            //System.out.println(v);
            ini = Calendar.getInstance().getTimeInMillis();
            v.mergesort(0, capacidade-1);
            fim = Calendar.getInstance().getTimeInMillis();
            //System.out.println(v);
            System.out.println("merge: " + (fim - ini));
            System.out.println("digite nova capacidade, 0 encerra");
            capacidade = sc. nextInt();
        }
        sc.close();
    }
}
