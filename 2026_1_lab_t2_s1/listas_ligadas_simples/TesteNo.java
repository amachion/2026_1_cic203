public class TesteNo {
    public static void main(String[] args) {
        No no1 = new No(10);
        No no2 = new No(20);
        System.out.println("no1: " + no1);
        System.out.println("no2: " + no2);
        no1.setProximo(no2);
        System.out.println("no1 depois do setProximo:");
        System.out.println(no1);
        // o trecho a seguir entra em loop infinito: stack overflow
        // no2.setProximo(no1);
        // System.out.println("no2 depois do setproximo:");
        // System.out.println(no2);

        no1.getProximo().setInfo(50);
        System.out.println("no2 depois do acesso por no1:");
        System.out.println(no2);

        //cuidado
        //no2.getProximo().setInfo(100);
    }
}
