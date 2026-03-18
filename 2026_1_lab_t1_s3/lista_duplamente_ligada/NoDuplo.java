public class NoDuplo extends No {
    private No anterior;
    public NoDuplo (int info) {
        super(info);
    }
    public No getAnterior() {
        return anterior;
    }
    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }
    //o método toString será o herdado da classe No
}
