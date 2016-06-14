package Universidade;

import java.util.ArrayList;

public class DisciplinaMatriculada {
	private ArrayList<Disciplina> disciplina = new ArrayList<Disciplina>();

    public DisciplinaMatriculada() {
    }

	protected ArrayList<Disciplina> getDisciplina() {
		return disciplina;
	}

	protected void setDisciplina(ArrayList<Disciplina> disciplina) {
		this.disciplina = disciplina;
	}
    

}