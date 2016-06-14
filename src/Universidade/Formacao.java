package Universidade;

import java.util.Date;

public abstract class Formacao extends Aluno{

    public Formacao(String n, Date D, boolean s, String Ra, Historico h) {
    	super(n, D, s, Ra);
    	setHistorico(h);
    	
    }
    private double Coeficiente;
    private Historico historico;
    
	protected double getCoeficiente() {
		return Coeficiente;
	}
	protected void setCoeficiente(double coeficiente) {
		Coeficiente = coeficiente;
	}
	protected Historico getHistorico() {
		return historico;
	}
	protected void setHistorico(Historico historico) {
		this.historico = historico;
	}

}