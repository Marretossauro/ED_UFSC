public class Elemento {

    int id;
    int headValue;
    Elemento prox;
    Elemento anterior;

    Elemento(int value, int id) {
        this.headValue = value;
        this.id = id;
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

    public int retornaId() {
        return this.id;
    }

}
