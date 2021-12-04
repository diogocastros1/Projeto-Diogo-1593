package br.inatel.c206.utils;

import br.inatel.c206.tipo.Aluno;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Reescrever {

    private static Path aluno = Paths.get("alunos.txt");
    private static Path professor = Paths.get("professor.txt");
    private static Path monitor = Paths.get("monitor.txt");
    private static Scanner input = new Scanner(System.in);;

    public static void alunos(){
        List<Aluno> listaAluno = new ArrayList<>();
        Aluno aux = new Aluno();

        System.out.println("Digite o nome do aluno:");
        aux.setNome(input.next());

        System.out.println("Digite o curso do aluno:");
        aux.setCurso(input.next());

        try{
            List<String> linhas = Files.readAllLines(aluno);

            linhas.forEach(l -> {
                String linhaSplit[] = l.split(";");

                if(!linhaSplit[0].strip().equals(aux.getNome()) || linhaSplit[2].strip().equals(aux.getCurso())) {
                    Aluno a = new Aluno(linhaSplit[0].strip(), linhaSplit[1].strip());
                    listaAluno.add(a);
                }
                else {
                    System.out.println("Selecione o que deseja alterar:");
                    System.out.println("1 - Nome");
                    System.out.println("2 - Curso");

                    if (input.nextInt() == 1){
                        Aluno a = new Aluno();
                        System.out.println("Digite o novo nome:");
                        a.setNome(input.nextLine());
                        a.setCurso(linhaSplit[1].strip());
                        listaAluno.add(a);
                    }
                }

            });

            Files.delete(aluno);

            listaAluno.forEach(l -> {
                Cadastro.aluno(l.getNome(),l.getCurso());
            });

        } catch(IOException e){
            e.printStackTrace();
        }
    }
}








