public class TesteNo {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Ana", 2004);

        No<Pessoa> no1 = new No<>(p1);

        No<String> no2 = new No<>("minha string");

        No<Integer> no3 = new No<>(new Integer(123456));
    }
}
