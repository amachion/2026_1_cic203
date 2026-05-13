import java.util.Random;
import java.util.Scanner;

public class TesteHeap {
    public static void main(String[] args) {
        Random random = new  Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o tamanho do heap?");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++)
            a[i] = random.nextInt(n*5);
        Heap heap = new Heap(a);
        System.out.println("heap:\n" + heap);
        scanner.close();
        heap.heapSort();
        System.out.println("valores ordenados:\n" + heap);
    }
}
