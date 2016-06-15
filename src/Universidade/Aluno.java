package Universidade;

import java.util.*;

public abstract class Aluno {

    public Aluno(String n, Date D, boolean s, String Ra, Endereco e) {
    	setNome(n);
    	setDatadeNascimento(D);
    	setSexo(s);
    	setRA(Ra);
    	setEndereco(e);
    }

    private String Nome;
    private Date DatadeNascimento;
    private Boolean Sexo;
    private String RA;
    private Endereco endereco;
    
	protected String getNome() {
		return Nome;
	}
	protected void setNome(String nome) {
		Nome = nome;
	}
	protected Date getDatadeNascimento() {
		return DatadeNascimento;
	}
	protected void setDatadeNascimento(Date datadeNascimento) {
		DatadeNascimento = datadeNascimento;
	}
	protected Boolean getSexo() {
		return Sexo;
	}
	protected void setSexo(Boolean sexo) {
		Sexo = sexo;
	}
	protected String getRA() {
		return RA;
	}
	protected void setRA(String rA) {
		RA = rA;
	}
	protected Endereco getEndereco() {
		return endereco;
	}
	protected void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	protected boolean seFormar(Aluno a) {
		if (a instanceof Formacao) {
			Formacao formacao = (Formacao) a;
			if((calcCredito(formacao)) && (calcCoeficiente(formacao)) && (calculaNota(formacao))){
				return true;
			}
			
		}else{
			
		}
		return false;
	}
	
	private boolean calcCredito(Formacao formacao) {
		if(formacao.getHistorico().getCredito() >= formacao.getCurso().getCreditoMinimos())
			return true;
		else{
			System.out.println("Não atingiu os Créditos Mínimos.");
			return false;
		}
	}
	
	private boolean calcCoeficiente(Formacao formacao) {
		if (formacao instanceof Mestrado) {
			Mestrado mestre = (Mestrado) formacao;
			if(mestre.getHistorico().getCoeficiente() > 0.7)
				return true;
			else{
				System.out.println("Não atintigiu o coeficiente mínimo 0.7");
				return false;
			}
		}else{
			if(formacao.getHistorico().getCoeficiente() > 0.5)
				return true;
			else{
				System.out.println("Não atintigiu o coeficiente mínimo 0.5");
				return false;
			}
		}
	}
	
	private boolean calculaNota(Formacao formacao) {
		boolean na = false;
		if (formacao instanceof Graduacao) {
			Graduacao graduacao = (Graduacao) formacao;
			for (Iterator<DisciplinaCompletas> iterator = graduacao.getHistorico().getHistorico().iterator(); iterator.hasNext();) {
				DisciplinaCompletas dc = (DisciplinaCompletas) iterator.next();
				if(dc.getNota() < 3){
					System.out.println("Matéria: "+dc.getDisciplina().getNome()+"com nota abaixo de 3, Nota: "+dc.getNota());
					na = true;
				}
			}
		}else{
			for (Iterator<DisciplinaCompletas> iterator = formacao.getHistorico().getHistorico().iterator(); iterator.hasNext();) {
				DisciplinaCompletas dc = (DisciplinaCompletas) iterator.next();
				if(dc.getNota() < 5){
					System.out.println("Matéria: "+dc.getDisciplina().getNome()+"com nota abaixo de 5, Nota: "+dc.getNota());
					na = true;
				}
			}
		}
		if(na) return false;
		else return true;
	}

}