import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    private Contato c;

    Scanner sc = new Scanner(System.in);
    private ArrayList<Contato> agenda = new ArrayList<Contato>();

    public boolean checkNumeros(String telefone) {
        boolean isNumeric = (telefone != null && telefone.matches("[0-9]+"));
        return isNumeric;
    }

    public boolean checkEmail(String email) {
        boolean isEmail = (email != null && email.matches("@+"));
        return isEmail;
    }



    public void addContato() {
        try {
            System.out.println("Digite o nome do contato que você quer adicionar:");
            String nome = sc.nextLine();

            if(nome.equals("")) {
                throw new Exception("Campo 'nome' vazio");
            }

            System.out.println("Informe o número do contato que vc quer adicionar");
            String telefone = sc.nextLine();

            if(telefone.equals("")) {
                throw new Exception("Campo 'telefone' vazio");
            } else if (!checkNumeros(telefone)) {
                throw new Exception("Caracteres de telefone inválidos");
            } else if(telefone.length() < 9) {
                throw new Exception("Informe o número completo");
            }

            System.out.println("Informe o email do contato que vc quer adicionar");
            String email = sc.nextLine();

            if(email.equals("")) {
                throw new Exception("Campo 'email' vazio");
            } else if(checkEmail(email)) {
                throw new Exception("Email inválido");
            }

            System.out.println("Informe a data de nascimento");

            String dateString = sc.nextLine();
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate date = LocalDate.parse(dateString, formato);

            //System.out.println(date.format(formato));
            //LocalDate date = LocalDate.of(year, month, day);

            c = new Contato(nome, telefone, email, date);
            agenda.add(c);
            System.out.println("Contato " + c.getNome() + " foi adicionado");
            System.out.println("-------------------");
            System.out.println("'Limpando o buffer, aperte Enter'");
            sc.nextLine();
    } catch (Exception error) {
            System.out.println(error.getMessage());

        }
    }
    public void mostrarContatos() {
        for (int i = 0; i < agenda.size(); i++) {
            System.out.println(agenda.get(i).getNome() + " - " + agenda.get(i).getTelefone() + " - " + agenda.get(i).getData()+" - " + agenda.get(i).getEmail());

        }
    }

    public void excluirContato() {
        System.out.println("Informe o nome do contato que você deseja excluir");
        String removerNome = sc.nextLine();
        boolean nameChecked = false;

        for (int i = 0; i < agenda.size(); i++) {
                if(agenda.get(i).getNome().equals(removerNome)) {
                    agenda.remove(agenda.get(i));
                    System.out.println("Contato excluido com sucesso");
                    System.out.println("");
                    nameChecked = true;
                    break;
                }
            }

        if(!nameChecked){
            try {
                throw new Exception("O nome não está na lista");
            }catch(Exception error) {
                System.out.println(error.getMessage());
            }
        }
    }




    public void PesquisarContato() {
        System.out.println("Informe o nome do contato que você deseja pesquisar");
        String pesquisarNome = sc.nextLine();
        boolean nameChecked = false;

        for (int i = 0; i < agenda.size(); i++) {
                if(agenda.get(i).getNome().equals(pesquisarNome)) {
                    System.out.println("Você pesquisou o contato: " + agenda.get(i).getNome());
                    System.out.println("");
                    nameChecked = true;
                    break;
                }
            }
        if(!nameChecked){
            try {
                throw new Exception("O nome não está na lista");
            }catch(Exception error) {
                System.out.println(error.getMessage());
            }
        }

    }

}
