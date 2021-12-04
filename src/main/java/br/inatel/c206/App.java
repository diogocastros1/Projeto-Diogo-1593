package br.inatel.c206;

import br.inatel.c206.utils.*;

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
                Leitura.exibeAlunos();

                Menu.opcoesCorrentes();

                selecao = input.nextInt();
            }

            else if(selecao == 5){
                Leitura.exibeProfessor();

                Menu.opcoesCorrentes();

                selecao = input.nextInt();
            }

            else if(selecao == 6){
                Leitura.exibeMonitor();

                Menu.opcoesCorrentes();

                selecao = input.nextInt();
            }

            else if(selecao == 7){
                System.out.println("Entre com o nome do aluno:");
                String n = input.next();
                Delete.alunos(n);

                Menu.opcoesCorrentes();

                selecao = input.nextInt();
            }

            else if(selecao == 8){
                System.out.println("Entre com o nome do professor:");
                String n = input.next();
                Delete.professores(n);

                Menu.opcoesCorrentes();

                selecao = input.nextInt();
            }
            else if(selecao == 9){
                System.out.println("Entre com o nome do monitor:");
                String n = input.next();
                Delete.monitores(n);

                Menu.opcoesCorrentes();

                selecao = input.nextInt();
            }

            else if(selecao == 10){
                Reescrever.alunos();

                Menu.opcoesCorrentes();

                selecao = input.nextInt();
            }

        }
    }
}
