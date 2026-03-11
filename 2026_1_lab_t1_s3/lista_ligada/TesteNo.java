public class TesteNo {
    public static void main(String[] args) {
        No no1 = new No(10);
        No no2 = new No(20);

        System.out.println("no1: " + no1);
        System.out.println("no2: " + no2);

        no1.setProximo(no2);
        System.out.println("no1 depois do setProximo: " + no1);

        no2.setProximo(no1);
        System.out.println("no2 de pois do setProximo: " + no2);
    }
}
