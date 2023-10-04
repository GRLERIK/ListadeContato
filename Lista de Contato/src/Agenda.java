import jdk.jfr.ContentType;

public class Agenda {
    private Contato[] contatos;
    private int numContatos;

    public Agenda (int numContatos) {
        contatos = new Contato[numContatos];
    }

    void adicionarContatos(Contato contato) {
        for(int i = 0; i < contatos.length; i++){
            if(contatos[i] == null){
                contatos[i] = contato;
            }
        }
    }
    void listarContatos() {
        for(int i = 0; i < contatos.length; i++){
            System.out.println(contatos[i].getNome());
            System.out.println(contatos[i].getTelefone());
            System.out.println(contatos[i].getEmail());
        }


    }

}
