package Universidade;

import java.util.*;

public abstract class Aluno {

    public Aluno(String n, Date D, boolean s, String Ra) {
    	setNome(n);
    	setDatadeNascimento(D);
    	setSexo(s);
    	setRA(Ra);
    }

    private String Nome;
    private Date DatadeNascimento;
    private Boolean Sexo;
    private String RA;
    
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

}