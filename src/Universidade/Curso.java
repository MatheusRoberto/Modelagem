package Universidade;


public class Curso {

    public Curso(String n, int cm, double co, Grade g) {
    	setNome(n);
    	setCreditoMinimos(cm);
    	setCoeficienteMinimo(co);
    	setGrade(g);
    }

    private String Nome;
    private int CreditoMinimos;
    private double CoeficienteMinimo;
    private Grade grade;
    
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
	protected Grade getGrade() {
		return grade;
	}
	protected void setGrade(Grade grade) {
		this.grade = grade;
	}


}