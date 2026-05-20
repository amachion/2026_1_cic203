public class TesteHash {
    public static void main(String[] args) {
        NossoHash<Integer, String> mapa = new NossoHash<>();
        mapa.put (123, "asdf");
        mapa.put (456, "bnmk");
        mapa.put (789, "null");
        mapa.put (432, "zass");
        mapa.put (654, "zoom");
        mapa.put (987, "dfgh");
        mapa.imprime();
        String valor = mapa.get(654);
        if (valor == null) 
            System.out.println("chave nao encontrada");
        else 
            System.out.println("chave encontrada, valor: " + valor);
        if (mapa.containsKey(987))
            System.out.println("chave encontrada");
        else
            System.out.println("chave nao encontrada");
    }
}
