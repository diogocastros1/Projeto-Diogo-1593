package br.inatel.c206.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leitura {
    private static Path alunos = Paths.get("alunos.txt");
    private static Path professor = Paths.get("professor.txt");
    private static Path monitor = Paths.get("monitor.txt");

    public static void alunos(){
        Map<String, String> mapaAlunos = new HashMap<>();

        try{
            List<String> linhas = Files.readAllLines(alunos);

            linhas.forEach(l -> {
                String linhaSplit[] = l.split(";");
                mapaAlunos.put(linhaSplit[0],linhaSplit[1].strip());
            });

            System.out.println("---------Lista de Alunos---------");
            mapaAlunos.forEach((nome, curso) ->{
                System.out.println("Nome: " + nome + " | Curso: " + curso + "\n");
            });
            System.out.println("---------------------------------");

        } catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void professor(){
        Map<String, String> mapaProfessor = new HashMap<>();

        try{
            List<String> linhas = Files.readAllLines(alunos);

            linhas.forEach(l -> {
                String linhaSplit[] = l.split(";");
                mapaProfessor.put(linhaSplit[0],linhaSplit[1].strip());
            });

            System.out.println("---------Lista de Professores---------");
            mapaProfessor.forEach((nome, curso) ->{
                System.out.println("Nome: " + nome + " | Disciplina(s): " + curso + "\n");
            });
            System.out.println("---------------------------------");

        } catch(IOException e){
            e.printStackTrace();
        }
    }



}
