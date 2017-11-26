import control.ControladorMultilista;

public class Teste {
    public static void main(String[] args) {
        ControladorMultilista ctrlMultList = new ControladorMultilista();

        ctrlMultList.insereElemento("Rodolfo", "SIN", "Suporte", 1300.50);
        ctrlMultList.insereElemento("Marcelo", "CCO", "FrontEnd", 900.0);
        ctrlMultList.insereElemento("Marvos", "EEL", "Suporte", 600.0);
        ctrlMultList.insereElemento("Jorge", "SIN", "Piloto", 3000.4);
        ctrlMultList.insereElemento("Carreira", "GAY", "Abusador", 5000.90);
        System.out.println("---------------Busca por curso-------------------------------");
        System.out.println(ctrlMultList.buscaPorCurso("SIN"));
        System.out.println("---------------Busca por profissao---------------------------");
        System.out.println(ctrlMultList.buscarPorProfissao("Suporte"));
        System.out.println("---------------Busca por faixa de salario--------------------");
        System.out.println(ctrlMultList.buscarPorFaixaDeSalario(800.0,2000.0));
        System.out.println("---------------Busca por curso e profissao-------------------");
        System.out.println(ctrlMultList.buscarCursoProfissao("CCO","FrontEnd"));
        System.out.println("---------------Busca por curso e salario---------------------");
        System.out.println(ctrlMultList.buscarCursoSalario("GAY",3000.0,6000.0));
        System.out.println("---------------Busca por profissao e salario-------------------");
        System.out.println(ctrlMultList.buscarProfissaoSalario("Suporte",500.0,1500.0));
        ctrlMultList.excluiElemento(2);
        System.out.println(ctrlMultList.listaElementos());

    }
}
