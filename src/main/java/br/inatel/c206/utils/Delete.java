package br.inatel.c206.utils;

import br.inatel.c206.tipo.Aluno;
import br.inatel.c206.tipo.Monitor;
import br.inatel.c206.tipo.Professor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Delete {
    private static Path aluno = Paths.get("alunos.txt");
    private static Path professor = Paths.get("professor.txt");
    private static Path monitor = Paths.get("monitor.txt");

    public static void alunos(String nome){
        List<Aluno> listaAluno = new ArrayList<>();

        try{
            List<String> linhas = Files.readAllLines(aluno);

            linhas.forEach(l -> {
                String linhaSplit[] = l.split(";");

                if(!linhaSplit[0].strip().equals(nome)) {
                    Aluno a = new Aluno(linhaSplit[0].strip(), linhaSplit[1].strip());
                    listaAluno.add(a);
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

    public static void professores(String nome){
        List<Professor> listaProfessor = new ArrayList<>();

        try{
            List<String> linhas = Files.readAllLines(professor);

            linhas.forEach(l -> {
                String linhaSplit[] = l.split(";");

                if(!linhaSplit[0].strip().equals(nome)) {
                    Professor p = new Professor(linhaSplit[0].strip(), linhaSplit[1].strip());
                    listaProfessor.add(p);
                }
            });

            Files.delete(professor);

            listaProfessor.forEach(l -> {
                Cadastro.professor(l.getNome(),l.getMateria());
            });

        } catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void monitores(String nome){
        List<Monitor> listaMonitor = new ArrayList<>();

        try{
            List<String> linhas = Files.readAllLines(professor);

            linhas.forEach(l -> {
                String linhaSplit[] = l.split(";");

                if(!linhaSplit[0].strip().equals(nome)) {
                    Monitor m = new Monitor(linhaSplit[0].strip(), linhaSplit[1].strip(), Integer.parseInt(linhaSplit[2].strip()));

                    listaMonitor.add(m);
                }
            });

            Files.delete(monitor);

            listaMonitor.forEach(l -> {
                Cadastro.monitor(l.getNome(),l.getCurso(), l.getHorarioLivre());
            });

        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
