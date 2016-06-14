package Universidade;


public class Curso {

    public Curso() {
    }

    private String Nome;
    private int CreditoMinimos;
    private double CoeficienteMinimo;
    
	protected String getNome() {
		return Nome;
	}
	protected void setNome(String nome) {
		Nome = nome;
	}
	protected int getCreditoMinimos() {
		return CreditoMinimos;
	}
	protected void setCreditoMinimos(int creditoMinimos) {
		CreditoMinimos = creditoMinimos;
	}
	protected double getCoeficienteMinimo() {
		return CoeficienteMinimo;
	}
	protected void setCoeficienteMinimo(double coeficienteMinimo) {
		CoeficienteMinimo = coeficienteMinimo;
	}


}