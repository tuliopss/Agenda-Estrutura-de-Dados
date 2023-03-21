import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //Contato c = new Contato("Tulio", "932392", "tulio@email.com", LocalDate.of(2004, 04, 06));
        Agenda a = new Agenda();

            //TRATAMENTO DE EMAIL, NUMERO CONTATO E NASCIMENTO

            for (int i = 0; i < 1; i++) {
                a.addContato();
            }


        a.mostrar();
       a.excluirContato("Tulio");
//         a.mostrar();
    }
}