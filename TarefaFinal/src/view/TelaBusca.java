package view;

import control.ControladorMultilista;

import java.util.Scanner;

public class TelaBusca {

    private Scanner teclado;
    private TelaPrincipal telaPrincipal;
    private ControladorMultilista ctrlMultilista;

    public TelaBusca() {
        this.teclado = new Scanner(System.in);
        this.ctrlMultilista = new ControladorMultilista();
        this.telaPrincipal = new TelaPrincipal();
    }

    public void menu() {
        int opcao = 0;

        System.out.println("[1] Busca simples:");
        System.out.println("[2] Busca Composta:");
        System.out.println("[3] Volta para o menu principal");

        opcao = teclado.nextInt();

        switch (opcao) {
            case 1:
                buscaSimples();
                break;
            case 2:
                buscaComposta();
                break;
            case 3:
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
                String curso = teclado.nextLine();
                ctrlMultilista.buscaPorCurso(curso);
                break;
            case 2:
                System.out.println("Digite a profissão que você deseja para filtrar a busca");
                String prof = teclado.nextLine();
                ctrlMultilista.buscarPorProfissao(prof);
                break;
            case 3:
                System.out.println("Digite um intervalo de salários para filtrar a busca");
                System.out.println("Qual o valor mínimo do intervalo dos salários?");
                double min = teclado.nextDouble();
                System.out.println("Qual o valor máximo do intervalo dos salários?");
                double max = teclado.nextDouble();
                ctrlMultilista.buscarPorFaixaDeSalario(min, max);
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
        System.out.println("[4] Curso, Profissão e Salário");
        System.out.println("[5] Volta para o menu de busca");

        opcao = teclado.nextInt();

        switch (opcao) {
            case 1:

                System.out.println("Digite o curso e a profissão, respectivamente");
                String curso = teclado.nextLine();
                String prof = teclado.nextLine();
                break;

            case 2:

                System.out.println("Digite o curso e o intervalo de salário");
                System.out.println("Qual o curso desejado para filtrar a busca?");
                curso = teclado.nextLine();
                System.out.println("Digite o valor mínimo e valor máximo do intervalo para filtrar o salário, respectivamente");
                double min = teclado.nextDouble();
                double max = teclado.nextDouble();
                break;

            case 3:

                System.out.println("Digite a profissão e o intervalo de salário");
                System.out.println("Qual a profissão desejada para filtrar a busca?");
                prof = teclado.nextLine();
                System.out.println("Digite o valor mínimo e valor máximo do intervalo para filtrar o salário, respectivamente");
                min = teclado.nextDouble();
                max = teclado.nextDouble();
                break;

            case 4:

                System.out.println("Digite o curso, a profissão e o intervalo de salário");
                System.out.println("Qual o curso desejado para filtrar a busca?");
                curso = teclado.nextLine();
                System.out.println("Qual a profissão desejada para filtrar a busca?");
                prof = teclado.nextLine();
                System.out.println("Digite o valor mínimo e valor máximo do intervalo para filtrar o salário, respectivamente");
                min = teclado.nextDouble();
                max = teclado.nextDouble();
                break;

            case 5:

                menu();
                break;

            default:
                System.out.println("Digite uma opção válida");
                buscaComposta();
                break;
        }
    }
}
