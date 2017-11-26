package view;

import control.ControladorMultilista;

import java.util.Scanner;

public class TelaBusca {

    private Scanner teclado;
    private ControladorMultilista ctrlMultilista;

    public TelaBusca() {
        this.teclado = new Scanner(System.in);
        this.ctrlMultilista = ControladorMultilista.getCtrlMultlist();
    }

    public void menu() {
        int opcao = 0;

        System.out.println("[1] Busca simples");
        System.out.println("[2] Busca Composta");
        System.out.println("[3] Volta para o menu principal \n");

        opcao = teclado.nextInt();

        switch (opcao) {
            case 1:
                buscaSimples();
                break;
            case 2:
                buscaComposta();
                break;
            case 3:
                TelaPrincipal telaPrincipal = new TelaPrincipal();
                telaPrincipal.menu();
                break;
            default:
                System.out.println("Digite uma opção válida");
                menu();
                break;
        }
    }

    public void buscaSimples() {
        int opcao = 0;

        System.out.println("[1] Curso");
        System.out.println("[2] Profissão");
        System.out.println("[3] Salário");
        System.out.println("[4] Volta para o menu de busca");

        opcao = teclado.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite o curso que você deseja para filtrar a busca");
                teclado.nextLine();
                String curso = teclado.nextLine();
                System.out.println(ctrlMultilista.buscaPorCurso(curso));
                maisOperacoes();
                break;
            case 2:
                System.out.println("Digite a profissão que você deseja para filtrar a busca");
                teclado.nextLine();
                String prof = teclado.nextLine();
                System.out.println(ctrlMultilista.buscarPorProfissao(prof));
                maisOperacoes();
                break;
            case 3:
                System.out.println("Digite um intervalo de salários para filtrar a busca");
                System.out.println("Qual o valor mínimo do intervalo dos salários?");
                double min = Double.parseDouble(teclado.next());
                System.out.println("Qual o valor máximo do intervalo dos salários?");
                double max = Double.parseDouble(teclado.next());
                System.out.println(ctrlMultilista.buscarPorFaixaDeSalario(min, max));
                maisOperacoes();
                break;

            case 4:

                menu();
                break;

            default:
                System.out.println("Digite uma opção válida");
                buscaSimples();
                break;
        }
    }

    public void buscaComposta() {
        int opcao = 0;

        System.out.println("[1] Curso e Profissão");
        System.out.println("[2] Curso e Salário");
        System.out.println("[3] Profissão e Salário");
        System.out.println("[4] Volta para o menu de busca");

        opcao = teclado.nextInt();

        switch (opcao) {
            case 1:

                System.out.println("Digite o curso e a profissão, respectivamente");
                teclado.nextLine();
                String curso = teclado.nextLine();
                String prof = teclado.nextLine();
                System.out.println(ctrlMultilista.buscarCursoProfissao(curso, prof));
                maisOperacoes();
                break;

            case 2:

                System.out.println("Digite o curso e o intervalo de salário");
                System.out.println("Qual o curso desejado para filtrar a busca?");
                teclado.nextLine();
                curso = teclado.nextLine();
                System.out.println("Digite o valor mínimo e valor máximo do intervalo para filtrar o salário, respectivamente");
                Double min = Double.parseDouble(teclado.nextLine());
                Double max = Double.parseDouble(teclado.nextLine());
                System.out.println(ctrlMultilista.buscarCursoSalario(curso, min, max));
                maisOperacoes();
                break;

            case 3:

                System.out.println("Digite a profissão e o intervalo de salário");
                System.out.println("Qual a profissão desejada para filtrar a busca?");
                teclado.nextLine();
                prof = teclado.nextLine();
                System.out.println("Digite o valor mínimo e valor máximo do intervalo para filtrar o salário, respectivamente");
                min = Double.parseDouble(teclado.nextLine());
                max = Double.parseDouble(teclado.nextLine());
                System.out.println(ctrlMultilista.buscarProfissaoSalario(prof, min, max));
                maisOperacoes();
                break;

            case 4:

                menu();
                break;

            default:
                System.out.println("Digite uma opção válida");
                buscaComposta();
                break;
        }
    }

    private void maisOperacoes() {
        System.out.println("Deseja fazer mais alguma operação? Digite 1 para 'Sim' e 0 para 'Não' ");
        int opcOp = teclado.nextInt();
        if (opcOp == 1) {
            menu();
        } else {
            return;
        }
    }

}
