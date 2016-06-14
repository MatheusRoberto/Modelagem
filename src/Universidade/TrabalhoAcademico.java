package Universidade;

import java.util.*;


public abstract class TrabalhoAcademico {

    public TrabalhoAcademico(boolean f, String titulo, String resumo) {
    	setFinalizada(f);
    	setTitulo(titulo);
    	setResumo(resumo);
    }

    private Boolean Finalizada;
    private String Titulo;
    private String Resumo;
    private ArrayList<String> PalavraChave;
    
	protected Boolean getFinalizada() {
		return Finalizada;
	}
	protected void setFinalizada(Boolean finalizada) {
		Finalizada = finalizada;
	}
	protected String getTitulo() {
		return Titulo;
	}
	protected void setTitulo(String titulo) {
		Titulo = titulo;
	}
	protected String getResumo() {
		return Resumo;
	}
	protected void setResumo(String resumo) {
		Resumo = resumo;
	}
	protected ArrayList<String> getPalavraChave() {
		return PalavraChave;
	}
	protected void setPalavraChave(ArrayList<String> palavraChave) {
		PalavraChave = palavraChave;
	}

}