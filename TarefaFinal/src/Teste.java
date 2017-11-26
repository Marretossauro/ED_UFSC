import control.ControladorMultilista;

public class Teste {
    public static void main(String[] args) {
        ControladorMultilista ctrlMultList = new ControladorMultilista();

        ctrlMultList.insereElemento("Rodolfo", "SIN", "Suporte", 1300.50);
        ctrlMultList.insereElemento("Marcelo", "CCO", "FrontEnd", 900.0);
        ctrlMultList.insereElemento("Marvos", "EEL", "Suporte", 600.0);
        ctrlMultList.insereElemento("Jorge", "SIN", "Piloto", 3000.4);
        ctrlMultList.insereElemento("Carreira", "GAY", "Abusador", 5000.90);
        System.out.println(ctrlMultList.buscarPorFaixaDeSalario(800.0,2000.0));

    }
}
