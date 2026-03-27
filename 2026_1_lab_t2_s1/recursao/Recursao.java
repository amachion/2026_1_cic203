public class Recursao {
    static int soma (int i, int n) {
        if (i == n) return n;
        return i + soma(i+1, n);
    }
    static int soma (int n) {
        if (n==1) return 1;
        return n + soma(n-1);
    }
    static void exibeNa1 (int n) {
        if (n < 5) exibeNa1(n+1);
        System.out.println(n);
    }
    //recursao de cauda: a última instrução é uma chamada recursiva
    static void exibe1aN (int n) { 
        System.out.println(n);
        if (n < 5) exibe1aN (n+1);
    }
    public static void main(String[] args) {
        System.out.println(soma(5));
        System.out.println(soma(1, 5));
        exibeNa1(1);
        exibe1aN(1);
    }
}
