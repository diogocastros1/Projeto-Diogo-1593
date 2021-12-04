package br.inatel.c206.tipo;

public class Monitor extends Aluno {
    private int horariosLivre;

    public Monitor(String nome, String curso, int horarioLivre) {
        super(nome, curso);
        this.horariosLivre = horarioLivre;
    }

    public int getHorarioLivre() {
        return horariosLivre;
    }

    public void setHorarioLivre(int horariosLivre) {
        this.horariosLivre = horariosLivre;
    }
}
