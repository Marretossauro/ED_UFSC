package view;

import java.util.Scanner;

public class TelaPrincipal {

    private Scanner teclado;
    private TelaBusca telaBusca;

    public TelaPrincipal() {
        this.teclado = new Scanner(System.in);
        this.telaBusca = new TelaBusca();
    }

    public void menu() {
        int opcao = 0;

        System.out.println("[1] Cadastrar elemento: ");
        System.out.println("[2] Remover elemento: ");
        System.out.println("[3] Listar todos: ");
        System.out.println("[4] Buscar elemento: ");

        opcao = teclado.nextInt();

        switch (opcao) {
            case 1:
            case 2:
            case 3:
            case 4:
                telaBusca.menu();
                break;
            default:
                System.out.println("Digite uma opção válida!!!");
                menu();
                break;
        }
    }
}
