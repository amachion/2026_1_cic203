public class Classe {
    int a, b, c;
    public Classe (int a) {
        this.a = a*37;
    }
    public Classe (int a, int b) {
        this(a);
        this.b = b-8;
    }
    public Classe (int a, int b, int c) {
        this (a, b);
        this.c = c;
    }
}
