package br.inatel.c206;

import br.inatel.c206.utils.Cadastro;
import br.inatel.c206.utils.Leitura;
import br.inatel.c206.utils.Menu;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int selecao = 0;
        String nome;
        String curso;
        int horariosLivres;

        Menu.opcoesIniciais();
        selecao = input.nextInt();

        while(selecao != 0){

            if(selecao == 1){
                System.out.println("Digite o nome do aluno: ");
                nome = input.next();
                System.out.println("Digite o curso do aluno: ");
                curso = input.next();

                Cadastro.aluno(nome, curso);

                Menu.opcoesCorrentes();

                selecao = input.nextInt();
            }

            else if(selecao == 2){
                System.out.println("Digite o nome do professor: ");
                nome = input.next();
                System.out.println("Digite a disciplina do professor: ");
                curso = input.next();

                Cadastro.professor(nome, curso);

                Menu.opcoesCorrentes();

                selecao = input.nextInt();
            }

            else if(selecao == 3){
                System.out.println("Digite o nome do monitor: ");
                nome = input.next();
                System.out.println("Digite o curso do monitor: ");
                curso = input.next();
                System.out.println("Quantos horarios livres: ");
                horariosLivres = input.nextInt();

                Cadastro.monitor(nome, curso, horariosLivres);

                Menu.opcoesCorrentes();

                selecao = input.nextInt();
            }

            else if(selecao == 4){
                Leitura.alunos();

                Menu.opcoesCorrentes();

                selecao = input.nextInt();
            }

        }
    }
}
