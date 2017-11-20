package view;

import java.util.Scanner;

public class TelaBusca {
    private Scanner teclado;

    public TelaBusca() {
        this.teclado = new Scanner(System.in);
    }

    public void menu() {
        int opcao = 0;

        System.out.println("[1] Busca simples: ");
        System.out.println("[2] Busca Composta: ");

        opcao = teclado.nextInt();

        switch (opcao) {
            case 1:
            case 2:
            default:
                System.out.println("Digite uma opção válida!!!");
                menu();
                break;
        }
    }

    public void buscaSimples() {
        int opcao = 0;

        System.out.println("Diretorio 1");
        System.out.println("Diretorio 2");
        System.out.println("Diretorio 3");

        opcao = teclado.nextInt();

        switch (opcao) {
            case 1:
            case 2:
            case 3:
            default:
                System.out.println("Digite uma opção válida!!!");
                buscaSimples();
                break;
        }
    }

    public void buscaComposta() {
        int opcao = 0;

        System.out.println("Diretorio 1");
        System.out.println("Diretorio 2");
        System.out.println("Diretorio 3");

        opcao = teclado.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Diretorio 2");
                System.out.println("Diretorio 3");
                opcao = teclado.nextInt();

                if (opcao == 2) {
                    //busca diretorio 1 com 2
                } else if (opcao == 3) {
                    //busca diretorio 1 com 3
                }

            case 2:
                System.out.println("Diretorio 1");
                System.out.println("Diretorio 3");
                opcao = teclado.nextInt();
                if (opcao == 1) {
                    //busca diretorio 2 com 1
                } else if (opcao == 3) {
                    //busca diretorio 2 com 3
                }

            case 3:
                System.out.println("Diretorio 1");
                System.out.println("Diretorio 2");
                opcao = teclado.nextInt();
                if (opcao == 1) {
                    //busca diretorio 3 com 1
                } else if (opcao == 2) {
                    //busca diretorio 3 com 2
                }

            default:
                System.out.println("Digite uma opção válida!!!");
                buscaComposta();
                break;
        }
    }
}
