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

}