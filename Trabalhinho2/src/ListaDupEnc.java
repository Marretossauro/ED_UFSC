public class ListaDupEnc {

    Elemento inicio;
    Elemento fim;
    Cursor cursor;

    public ListaDupEnc() {
        this.inicio = null;
        this.fim = null;
        cursor = new Cursor();
    }

    public void inserirAntesDoAtual(int valor) {
        Elemento element = new Elemento(valor);
        if (cursor.mandaAtual() == null && this.fim == null) {
            this.inicio = element;
            this.fim = element;
            cursor.defineAtual(this.inicio);
        } else if (cursor.mandaAtual().mandaAnterior() != null) {
            Elemento anteriorAtualOr = null;
            anteriorAtualOr = cursor.mandaAtual().mandaAnterior();
            anteriorAtualOr.defineProx(element);
            element.defineAnterior(anteriorAtualOr);
            element.defineProx(cursor.mandaAtual());
            cursor.mandaAtual().defineAnterior(element);
        } else {
            element.defineProx(cursor.mandaAtual());
            cursor.mandaAtual().defineAnterior(element);
        }
    }

    public void inserirAposOAtual(int valor) {
        Elemento element = new Elemento(valor);
        if (cursor.mandaAtual() == null && this.fim == null) {
            this.inicio = element;
            this.fim = element;
            cursor.defineAtual(this.inicio);
        } else if (cursor.mandaAtual().mandaProx() != null) {
            Elemento ProxAtualOr = null;
            ProxAtualOr = cursor.mandaAtual().mandaProx();
            ProxAtualOr.defineAnterior(element);
            element.defineProx(ProxAtualOr);
            element.defineAnterior(cursor.mandaAtual());
            cursor.mandaAtual().defineProx(element);
        } else {
            element.defineAnterior(cursor.mandaAtual());
            cursor.mandaAtual().defineProx(element);
        }
    }

    public void excluirAtual() throws Exception {
        if (cursor.mandaAtual() == null && this.fim == null) {
            throw new Exception("Lista Vazia");
        } else {
            cursor.mandaAtual().mandaAnterior().defineProx(cursor.mandaAtual().mandaProx());
            cursor.mandaAtual().mandaProx().defineAnterior(cursor.mandaAtual().mandaAnterior());
            cursor.defineAtual(cursor.mandaAtual().mandaAnterior());
        }
    }

    public boolean buscar(int valor) {
        Elemento el = new Elemento(0);
        if (cursor.mandaAtual().devolveHead() == valor) {
            System.out.println(cursor.mandaAtual().devolveHead());
            return true;
        } else {
            cursor.irParaPrimeiro();
            el = cursor.mandaAtual().mandaProx();
            while (el != null) {
                if (cursor.mandaAtual().devolveHead() == valor) {
                    return true;
                } else {
                    el = cursor.mandaAtual().mandaProx();
                }
                cursor.avancarKPassos(1);
            }

        }
        return false;
    }

}
