package br.inatel.c206;

import br.inatel.c206.utils.Cadastro;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int selecao = 0;

        System.out.println("Digite o numero de uma das opções abaixo:");
        System.out.println("1. Cadastro de Alunos");
        System.out.println("2. Cadastro de Professor");
        System.out.println("3. Cadastro de Monitor");

        selecao = input.nextInt();

        if(selecao == 1){
            System.out.println("Digite o nome do aluno: ");
            String nome = input.next();
            System.out.println("Digite o curso do aluno: ");
            String curso = input.next();

            Cadastro.aluno(nome, curso);
        }

        else if(selecao == 2){
            System.out.println("Digite o nome do professor: ");
            String nome = input.next();
            System.out.println("Digite o e-mail do professor: ");
            String curso = input.next();

            Cadastro.professor(nome, curso);
        }

        else if(selecao == 3){
            System.out.println("Digite o nome do monitor: ");
            String nome = input.next();
            System.out.println("Digite o curso do monitor: ");
            String curso = input.next();
            System.out.println("Quantos horarios livres: ");
            int horariosLivre = input.nextInt();

            Cadastro.monitor(nome, curso, horariosLivre);
        }
    }
}
