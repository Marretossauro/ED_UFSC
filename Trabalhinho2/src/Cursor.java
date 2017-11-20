public class Cursor {

    Elemento atual;

    public Cursor() {
        atual = null;
    }

    public void defineAtual(Elemento atual) {
        this.atual = atual;
    }

    public Elemento mandaAtual() {
        return this.atual;
    }

    public void avancarKPassos(int k) {
        int passos = 0;
        do {
            defineAtual(mandaAtual().mandaProx());
            passos++;
        } while (passos != k);
    }

    public void retrocederKPassos(int k) {
        int passos = 0;
        do {
            defineAtual(mandaAtual().mandaAnterior());
            passos++;
        } while (passos != k);
    }

    public void irParaPrimeiro() {
        while (mandaAtual().mandaAnterior() != null) {
            defineAtual(mandaAtual().mandaAnterior());
        }
    }

    public void irParaUltimo() {
        while (mandaAtual().mandaProx() != null) {
            defineAtual(mandaAtual().mandaProx());
        }
    }

}
