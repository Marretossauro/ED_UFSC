package view;

import control.ControladorMultilista;

import java.util.Scanner;

public class TelaPrincipal {

    private Scanner teclado;
    private TelaBusca telaBusca;
    private ControladorMultilista ctrlMultilista;

    public TelaPrincipal() {
        this.teclado = new Scanner(System.in);
        this.telaBusca = new TelaBusca();
        this.ctrlMultilista = new ControladorMultilista();
    }

    public void menu() {
        int opcao = 0;

        System.out.println("[1] Cadastrar elemento");
        System.out.print("[2] Carregar elementos pré-definidos");
        System.out.println("[3] Remover elemento");
        System.out.println("[4] Listar todos");
        System.out.println("[5] Buscar elemento");
        System.out.print("[0] Encerrar programa");

        opcao = teclado.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite o nome, curso, profissão e salário do indivíduo a ser adicionado, respectivamente");
                String nome = teclado.nextLine();
                String curso = teclado.nextLine();
                String prof = teclado.nextLine();
                Double salario = teclado.nextDouble();
                ctrlMultilista.insereElemento(nome, curso, prof, salario);
                maisOperacoes();
                break;
            case 2:
                ctrlMultilista.carregaElementos();
                ctrlMultilista.listaElementos();
                maisOperacoes();
                break;
            case 3:
                System.out.println("Digite a chave (ID) do indivíduo a ser removido");
                Integer id = teclado.nextInt();
                ctrlMultilista.excluiElemento(id);
                maisOperacoes();
                break;
            case 4:
                System.out.println(ctrlMultilista.listaElementos());
                maisOperacoes();
                break;
            case 5:
                telaBusca.menu();
                break;
            case 0:
                break;
            default:
                System.out.println("Digite uma opção válida");
                menu();
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
