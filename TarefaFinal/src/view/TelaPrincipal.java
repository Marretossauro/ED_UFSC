package view;

import control.ControladorMultilista;
import model.ValorInvalidoException;

import java.util.Scanner;

public class TelaPrincipal {

    private Scanner teclado;
    private ControladorMultilista ctrlMultilista;
    private TelaBusca telaBusca = new TelaBusca();

    public TelaPrincipal() {
        this.teclado = new Scanner(System.in);
        this.ctrlMultilista = ControladorMultilista.getCtrlMultlist();
    }

    public void menu() throws Exception {
        int opcao = 0;

        System.out.println("[1] Cadastrar elemento");
        System.out.println("[2] Carregar elementos pré-definidos");
        System.out.println("[3] Remover elemento");
        System.out.println("[4] Listar todos");
        System.out.println("[5] Buscar elemento");
        System.out.print("[0] Encerrar programa \n");

        try {
            opcao = teclado.nextInt();
        } catch (Exception e) {
            throw new ValorInvalidoException();
        }

        switch (opcao) {
            case 1:
                System.out.println("Digite o nome, curso, profissão e salário do indivíduo a ser adicionado, respectivamente");
                teclado.nextLine();
                String nome;
                try {
                    nome = teclado.nextLine();
                } catch (Exception e) {
                    throw new ValorInvalidoException();
                }
                String curso;
                try {
                    curso = teclado.nextLine();
                } catch (Exception e) {
                    throw new ValorInvalidoException();
                }
                String prof;
                try {
                    prof = teclado.nextLine();
                } catch (Exception e) {
                    throw new ValorInvalidoException();
                }
                Double salario;
                try {
                    salario = Double.parseDouble(teclado.nextLine());
                } catch (Exception e) {
                    throw new ValorInvalidoException();
                }
                ctrlMultilista.insereElemento(nome, curso, prof, salario);
                System.out.println(ctrlMultilista.listaElementos());
                maisOperacoes();
                break;
            case 2:
                ctrlMultilista.carregaElementos();
                System.out.println(ctrlMultilista.listaElementos());
                maisOperacoes();
                break;
            case 3:
                System.out.println("Digite a chave (ID) do indivíduo a ser removido");
                Integer id;
                try {
                    id = teclado.nextInt();
                } catch (Exception e) {
                    throw new ValorInvalidoException();
                }
                ctrlMultilista.excluiElemento(id);
                System.out.println(ctrlMultilista.listaElementos());
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
