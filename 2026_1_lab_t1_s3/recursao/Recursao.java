public class Recursao {
    public static int fat (int n) {
        //em primeiro lugar, o critério de parada
        if (n <= 1) return 1;
        return n * fat(n-1);
    }
    public static int fib (int n) {
        if (n <= 1) return 1;
        return fib(n-1) + fib(n-2);
    }
    public static int somaRec (int i, int n) {
        if (i == n) return i;
        return i + somaRec(i+1, n);
    }
    public static int somaRec (int n) {
        if (n<=1) return n;
        return n + somaRec(n-1);
    }
    public static void main(String[] args) {
        // for (int i=0; i<14; i++)
        //     System.out.printf("fatorial de %d = %d\n", i, fat(i));
        // for (int i=0; i<46; i++) 
        //     System.out.printf("fibonacci em %d = %d\n", i, fib(i));
        System.out.println("soma 1 a 10: " + somaRec(1, 10));
        System.out.println("soma de 1 a 5: " + somaRec(5));
    }
}