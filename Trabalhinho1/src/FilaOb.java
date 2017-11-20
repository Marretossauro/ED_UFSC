public class FilaOb {

    Elemento start;
    Elemento end;

    FilaOb() {
        this.start = null;
        this.end = null;
    }

    public void entraFila(Object valorFila) throws Exception {
        if (valorFila != null) {
            Elemento element = new Elemento (valorFila);
            if(this.end == null) {
                this.start = element;
                this.end = element;
            } else {
                this.end.defineProx(element);
                this.end = element;
            }
        } else {
            throw new Exception("Valor nulo, nao pode entrar na fila");
        }
    }

    public Object saiFila() throws Exception {
        if (this.end != null) {
            Elemento outFilaElem = this.start;
            Object outFila = outFilaElem.devolveHead();
            this.start = outFilaElem.mandaProx();
            return outFila;
        } else {
            throw new Exception("Fila vazia");
        }
    }

}
