package Universidade;

public class DisciplinaCompletas {
	
	private Disciplina disciplina;
	private int nota;
	
	public DisciplinaCompletas(Disciplina d, int nota) {
		setDisciplina(d);
		setNota(nota);
	}

	protected Disciplina getDisciplina() {
		return disciplina;
	}

	protected void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	protected int getNota() {
		return nota;
	}

	protected void setNota(int nota) {
		this.nota = nota;
	}

}
