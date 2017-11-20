public class Elemento {

    Object headValue;
    Elemento prox;

    Elemento(Object value) {
        this.headValue = value;
    }

    public void defineProx(Elemento proximo) {
        this.prox = proximo;
    }

    public Object devolveHead() {
        return this.headValue;
    }

    public Elemento mandaProx() {
        return this.prox;
    }

}
