

//LEMBRAR TABELA HASH

public class Main {
    public static void main(String[] args) {
        //Contato c = new Contato("Tulio", "932392", "tulio@email.com", LocalDate.of(2004, 04, 06));
        Agenda a = new Agenda();

            //TRATAMENTO DE EMAIL, NUMERO CONTATO E NASCIMENTO

            for (int i = 0; i < 2; i++) {
                a.addContato();
            }


        a.mostrar();
        //a.excluirContato();
        //a.mostrar();
        a.PesquisarContato();
    }
}