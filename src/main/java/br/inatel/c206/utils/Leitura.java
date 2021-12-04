package br.inatel.c206.utils;

import br.inatel.c206.tipo.Aluno;
import br.inatel.c206.tipo.Monitor;
import br.inatel.c206.tipo.Professor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leitura {
    private static Path aluno = Paths.get("alunos.txt");
    private static Path professor = Paths.get("professor.txt");
    private static Path monitor = Paths.get("monitor.txt");

    public static void exibeAlunos(){
        List<Aluno> alunos = new ArrayList<>();

        try{
            List<String> linhas = Files.readAllLines(aluno);

            linhas.forEach(l -> {
                String linhaSplit[] = l.split(";");

                Aluno a = new Aluno(linhaSplit[0],linhaSplit[1].strip());
                alunos.add(a);
            });

            System.out.println("---------Lista de Alunos---------");
            alunos.forEach(a ->{
                System.out.println("Nome: " + a.getNome() + ", Curso: " + a.getCurso() + "\n");
            });
            System.out.println("---------------------------------");

        } catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void exibeProfessor(){
        List<Professor> professores = new ArrayList<>();

        try{
            List<String> linhas = Files.readAllLines(professor);

            linhas.forEach(l -> {
                String linhaSplit[] = l.split(";");

                Professor p = new Professor(linhaSplit[0],linhaSplit[1].strip());
                professores.add(p);
            });

            System.out.println("---------Lista de Professores---------");
            professores.forEach(p ->{
                System.out.println("Nome: " + p.getNome() + ", Materia: " + p.getMateria() + "\n");
            });
            System.out.println("---------------------------------");

        } catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void exibeMonitor(){
        List<Monitor> monitores = new ArrayList<>();

        try{
            List<String> linhas = Files.readAllLines(monitor);

            linhas.forEach(l -> {
                String linhaSplit[] = l.split(";");

                Monitor m = new Monitor(linhaSplit[0],linhaSplit[1].strip(),Integer.parseInt(linhaSplit[2].strip()));
                monitores.add(m);
            });

            System.out.println("---------Lista de Monitores---------");
            monitores.forEach(m ->{
                System.out.println("Nome: " + m.getNome() + ", Curso: " + m.getCurso() + ", Horario(s) Livre(s): " + m.getHorarioLivre() + "\n");
            });
            System.out.println("---------------------------------");

        } catch(IOException e){
            e.printStackTrace();
        }
    }



}
