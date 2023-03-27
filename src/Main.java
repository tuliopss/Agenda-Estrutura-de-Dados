

//LEMBRAR TABELA HASH

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Agenda a = new Agenda();
        boolean executando = true;
        while (executando) {
            System.out.println("Digite a opção desejada: ");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Excluir contato");
            System.out.println("3 - Pesquisar contato");
            System.out.println("4 - Exibir lista de contatos");
            System.out.println("5 - Sair");

            int opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    a.addContato(); //Regras p adicionar telefone: apenas números e string tamanho 9 caracteres
                                    //Regras p adicionar email: tem que conter @ na string
                                    //Formato de data no input: dd/mm/aaaa
                    break;
                case 2:
                    a.excluirContato();
                    break;
                case 3:
                    a.pesquisarContato();
                    break;
                case 4:
                    a.mostrarContatos();
                    break;
                case 5:
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
//        Agenda a = new Agenda();
//            for (int i = 0; i < 2; i++) {
//                a.addContato();
//            }
//
//        a.mostrarContatos();
//        a.excluirContato();
//        a.mostrarContatos();
//        a.PesquisarContato();

    }
}
