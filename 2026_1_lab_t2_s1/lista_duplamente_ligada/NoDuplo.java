public class NoDuplo extends No {
    private No anterior;
    public NoDuplo (int info) {
        super(info);
        this.anterior = null;
    }
    public No getAnterior() {
        return anterior;
    }
    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }
    //o toString() é herdado de No
}