package Universidade;

import java.util.Date;

public abstract class Formacao extends Aluno{

    public Formacao(String n, Date D, boolean s, String Ra, Historico h, Curso c, Endereco e) {
    	super(n, D, s, Ra, e);
    	setHistorico(h);    	
    }
    private Historico historico;
    private Curso curso;
    private Semestre semestre;
    
	protected Historico getHistorico() {
		return historico;
	}
	protected void setHistorico(Historico historico) {
		this.historico = historico;
	}
	protected Curso getCurso() {
		return curso;
	}
	protected void setCurso(Curso curso) {
		this.curso = curso;
	}
	protected Semestre getSemestre() {
		return semestre;
	}
	protected void setSemestre(Semestre semestre) {
		this.semestre = semestre;
	}

}