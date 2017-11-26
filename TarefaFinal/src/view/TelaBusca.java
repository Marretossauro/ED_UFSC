package view;

import control.ControladorMultilista;
import model.ValorInvalidoException;

import java.util.Scanner;

public class TelaBusca {

    private Scanner teclado;
    private ControladorMultilista ctrlMultilista;

    public TelaBusca() {
        this.teclado = new Scanner(System.in);
        this.ctrlMultilista = ControladorMultilista.getCtrlMultlist();
    }

    public void menu() throws Exception {

        int opcao = 0;

        System.out.println("[1] Busca Simples");
        System.out.println("[2] Busca Composta");
        System.out.println("[3] Volta para o menu principal \n");

        try {
            opcao = teclado.nextInt();
        } catch (Exception e) {
            throw new ValorInvalidoException();
        }

        switch (opcao) {
            case 1:
                buscaSimples();
                break;
            case 2:
                buscaComposta();
                break;
            case 3:
                TelaPrincipal telaPrincipal = new TelaPrincipal();
                try {
                    telaPrincipal.menu();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Digite uma opção válida");
                menu();
                break;
        }
    }

    public void buscaSimples() throws Exception {
        int opcao = 0;

        System.out.println("[1] Curso");
        System.out.println("[2] Profissão");
        System.out.println("[3] Salário");
        System.out.println("[4] Volta para o menu de busca");

        try {
            opcao = teclado.nextInt();
        } catch (Exception e) {
            throw new ValorInvalidoException();
        }

        switch (opcao) {
            case 1:
                System.out.println("Digite o curso que você deseja para filtrar a busca");
                teclado.nextLine();
                String curso = null;
                try {
                    curso = teclado.nextLine();
                } catch (Exception e) {
                    throw new ValorInvalidoException();
                }
                System.out.println(ctrlMultilista.buscaPorCurso(curso));
                maisOperacoes();
                break;
            case 2:
                System.out.println("Digite a profissão que você deseja para filtrar a busca");
                teclado.nextLine();
                String prof = null;
                try {
                    prof = teclado.nextLine();
                } catch (Exception e) {
                    throw new ValorInvalidoException();
                }
                System.out.println(ctrlMultilista.buscarPorProfissao(prof));
                maisOperacoes();
                break;
            case 3:
                System.out.println("Digite um intervalo de salários para filtrar a busca");
                System.out.println("Qual o valor mínimo do intervalo dos salários?");
                double min = 0;
                try {
                    min = Double.parseDouble(teclado.next());
                } catch (Exception e) {
                    throw new ValorInvalidoException();
                }
                System.out.println("Qual o valor máximo do intervalo dos salários?");
                double max = 0;
                try {
                    max = Double.parseDouble(teclado.next());
                } catch (Exception e) {
                    throw new ValorInvalidoException();
                }
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

    public void buscaComposta() throws Exception {
        int opcao = 0;

        System.out.println("[1] Curso e Profissão");
        System.out.println("[2] Curso e Salário");
        System.out.println("[3] Profissão e Salário");
        System.out.println("[4] Volta para o menu de busca");

        try {
            opcao = teclado.nextInt();
        } catch (Exception e) {
            throw new ValorInvalidoException();
        }

        switch (opcao) {
            case 1:

                System.out.println("Digite o curso que você deseja para filtrar a busca");
                teclado.nextLine();
                String curso = null;
                try {
                    curso = teclado.nextLine();
                } catch (Exception e) {
                    throw new ValorInvalidoException();
                }
                System.out.println("Digite a profissão que você deseja para filtrar a busca");
                String prof = null;
                try {
                    prof = teclado.nextLine();
                } catch (Exception e) {
                    throw new ValorInvalidoException();
                }
                System.out.println(ctrlMultilista.buscarCursoProfissao(curso, prof));
                maisOperacoes();
                break;

            case 2:

                System.out.println("Digite o curso desejado para filtrar a busca");
                teclado.nextLine();
                try {
                    curso = teclado.nextLine();
                } catch (Exception e) {
                    throw new ValorInvalidoException();
                }
                System.out.println("Digite o valor mínimo do intervalo de salário para filtrar a busca");
                double min = 0;
                try {
                    min = Double.parseDouble(teclado.nextLine());
                } catch (Exception e) {
                    throw new ValorInvalidoException();
                }
                System.out.println("Digite o valor máximo do intervalo de salário para filtrar a busca");
                double max = 0;
                try {
                    max = Double.parseDouble(teclado.nextLine());
                } catch (Exception e) {
                    throw new ValorInvalidoException();
                }
                System.out.println(ctrlMultilista.buscarCursoSalario(curso, min, max));
                maisOperacoes();
                break;

            case 3:

                System.out.println("Digite a profissão desejada para filtrar a busca");
                teclado.nextLine();
                try {
                    prof = teclado.nextLine();
                } catch (Exception e) {
                    throw new ValorInvalidoException();
                }
                System.out.println("Digite o valor mínimo do intervalo de salário para filtrar a busca");
                try {
                    min = Double.parseDouble(teclado.nextLine());
                } catch (Exception e) {
                    throw new ValorInvalidoException();
                }
                System.out.println("Digite o valor máximo do intervalo de salário para filtrar a busca");
                try {
                    max = Double.parseDouble(teclado.nextLine());
                } catch (Exception e) {
                    throw new ValorInvalidoException();
                }
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
            try {
                menu();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else {
            return;
        }
    }

}
