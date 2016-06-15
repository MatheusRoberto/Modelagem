package Universidade;

import java.util.ArrayList;

public class DisciplinaMatriculada {
	private ArrayList<Disciplina> disciplina = new ArrayList<Disciplina>();
	private Semestre semestre;

    public DisciplinaMatriculada() {
    }

	protected ArrayList<Disciplina> getDisciplina() {
		return disciplina;
	}

	protected void setDisciplina(ArrayList<Disciplina> disciplina) {
		this.disciplina = disciplina;
	}

	protected Semestre getSemestre() {
		return semestre;
	}

	protected void setSemestre(Semestre semestre) {
		this.semestre = semestre;
	}
    

}