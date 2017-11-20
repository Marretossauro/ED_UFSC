public class Teste {

    public static void main(String[] args) {
        testeLista();
    }

    public static void testeLista() {

        System.out.println("\n ------ Teste da Lista ------ \n");

        ListaDupEnc list = new ListaDupEnc();

        list.inserirAntesDoAtual(800);
        list.inserirAntesDoAtual(700);
        list.cursor.retrocederKPassos(1);
        list.inserirAposOAtual(900);
        list.inserirAposOAtual(1000);
        list.inserirAntesDoAtual(500);
        list.inserirAntesDoAtual(600);
        try {
            list.excluirAtual();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(list.buscar(700));

    }

}
