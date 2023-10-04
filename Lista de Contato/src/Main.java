import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in);
        //System.out.println("Quantos contatos deseja adicionar ?");
        //int n =sc.nextInt();


        Agenda agenda = new Agenda(2);
        Contato gab = new Contato("Gabriel", "telefone", "email");
        Contato th = new Contato("Thiago", "fdf", "dsd");

        agenda.adicionarContatos(gab);
        agenda.adicionarContatos(th);

        agenda.listarContatos();

    }
}