import java.util.Random;
import java.util.Scanner;

public class TesteHeap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite a capacidade do heap: ");
        int capacidade = scanner.nextInt();
        int[] v = new int[capacidade];
        Random random = new Random();
        System.out.println("vetor original:\n");
        for (int i=0; i<capacidade; i++) {
            v[i] = random.nextInt(capacidade * 10);
            System.out.print(v[i] + " ");
        }
        Heap heap = new Heap(v);
        System.out.println("\nHeap de maximo:\n" + heap);

        heap.heapSort();
        System.out.println("\nVetor ordenado:\n" + heap);
    }
}
