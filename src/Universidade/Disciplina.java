package Universidade;

public class Disciplina {

    public Disciplina() {
    }

    private String Nome;
    private String Ementa;
    private int Credito;
    private int CargaHoraria;

	protected String getNome() {
		return Nome;
	}
	protected void setNome(String nome) {
		Nome = nome;
	}
	protected String getEmenta() {
		return Ementa;
	}
	protected void setEmenta(String ementa) {
		Ementa = ementa;
	}
	protected int getCredito() {
		return Credito;
	}
	protected void setCredito(int credito) {
		Credito = credito;
	}
	protected int getCargaHoraria() {
		return CargaHoraria;
	}
	protected void setCargaHoraria(int cargaHoraria) {
		CargaHoraria = cargaHoraria;
	}




}