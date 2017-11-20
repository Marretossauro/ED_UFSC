public class Teste {

    public static void main(String[] args) {
        testePilha();
        testeFila();
    }

    public static void testePilha() {

        System.out.println("\n ------ Teste da Pilha ------ \n");

        PilhaOb pilha = new PilhaOb();

        try {
            pilha.push(800);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(pilha.pop());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            pilha.push(900);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            pilha.push(70);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            pilha.push(500);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(pilha.pop());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(pilha.pop());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(pilha.pop());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void testeFila() {

        System.out.println("\n ------ Teste da Fila ------ \n");

        FilaOb fila = new FilaOb();

        try {
            fila.entraFila(30);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            fila.entraFila(900);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            fila.entraFila(70);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            fila.entraFila(500);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(fila.saiFila());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(fila.saiFila());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(fila.saiFila());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(fila.saiFila());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
