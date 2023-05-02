package aula;

import java.util.Scanner;

public class GerenciadorContatos {
    private Contato[] agenda;

    public GerenciadorContatos(int tamanho){
        agenda = new contato[tamanho];

    }
    public Contato[] add(){
        Scanner input = new Scanner(System.in);
        //preenchendo os dados do vetor
        for(int i=0, i<agenda.length; i++){
            String nome = input.next();
            String telefone = input.next();
            Contato c = new Contato(nome, telefone);
            agenda[i] = c;

        }
        return agenda;
    }

    public void mostrarContatos(){
        for(int i=0, i<agenda.length; i++){
            System.out.println("Nome" + agenda[i].getNome);
            System.out.println("Telefone" + agenda[i].getTelefone);
        }
    }
}
