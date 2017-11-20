public class ExLista {

    private Elemento inicio;
    private Elemento fim;
    private Elemento[] hash;

    public ExLista(int tamHash) {
        this.inicio = null;
        this.fim = null;
        this.hash = new Elemento[tamHash];
    }

    public void insereNoInicio(int elemento, int id) {
        Elemento element = new Elemento(elemento, id);
        if (this.inicio == null) {
            this.inicio = element;
            this.fim = element;
        } else {
            this.inicio.defineProx(element);
            this.inicio = element;
        }
        hash[element.retornaId() % hash.length] = element;
    }

    public int buscar(int ref) {

    }

    public void excluir(int ref) {

    }

    public static void main(String[] args) {

    }

}