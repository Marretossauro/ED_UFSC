package view;

public class Main {

    public static void main(String[] args) {
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        try {
            telaPrincipal.menu();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
