package Universidade;

public class Endereco {

    public Endereco() {
    }
    private String Logradouro;
    private int Numero;
    private String Complemento;
    private String Bairro;
    private String Cidade;
    private String UF;
    private String CEP;
	protected String getLogradouro() {
		return Logradouro;
	}
	protected void setLogradouro(String logradouro) {
		Logradouro = logradouro;
	}
	protected int getNumero() {
		return Numero;
	}
	protected void setNumero(int numero) {
		Numero = numero;
	}
	protected String getComplemento() {
		return Complemento;
	}
	protected void setComplemento(String complemento) {
		Complemento = complemento;
	}
	protected String getBairro() {
		return Bairro;
	}
	protected void setBairro(String bairro) {
		Bairro = bairro;
	}
	protected String getCidade() {
		return Cidade;
	}
	protected void setCidade(String cidade) {
		Cidade = cidade;
	}
	protected String getUF() {
		return UF;
	}
	protected void setUF(String uF) {
		UF = uF;
	}
	protected String getCEP() {
		return CEP;
	}
	protected void setCEP(String cEP) {
		CEP = cEP;
	}
    
    

}