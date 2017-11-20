public class Elemento {

    int headValue;
    Elemento anterior;
    Elemento prox;

    Elemento(int value) {
        this.headValue = value;
    }

    public void atribuiValor(int valor) {
        this.headValue = valor;
    }

    public void defineProx(Elemento proximo) {
        this.prox = proximo;
    }

    public void defineAnterior(Elemento anterior) {
        this.anterior = anterior;
    }

    public int devolveHead() {
        return this.headValue;
    }

    public Elemento mandaProx() {
        return this.prox;
    }

    public Elemento mandaAnterior() {
        return this.anterior;
    }

}
