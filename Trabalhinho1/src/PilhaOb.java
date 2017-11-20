public class PilhaOb {

    Elemento start;

    PilhaOb() {
        this.start = null;
    }

    public void push(Object valorPilha) throws Exception {
        if (valorPilha != null) {
            Elemento element = new Elemento (valorPilha);
            element.defineProx(this.start);
            this.start = element;
        } else {
            throw new Exception("Valor de push nulo");
        }
    }

    public Object pop() throws Exception {
        if (this.start != null) {
            Object valPop = this.start.devolveHead();
            this.start = this.start.mandaProx();
            return valPop;
        } else {
            throw new Exception("Pilha vazia");
        }
    }

}
