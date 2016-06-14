package Universidade;

import java.util.Date;

public class Semestre {

    public Semestre(Date a, boolean s) {
    	setAno(a);
    	setSemestredoAno(s);
    }

    private Date Ano;
    private Boolean SemestredoAno;
    
	protected Date getAno() {
		return Ano;
	}
	protected void setAno(Date ano) {
		Ano = ano;
	}
	protected Boolean getSemestredoAno() {
		return SemestredoAno;
	}
	protected void setSemestredoAno(Boolean semestredoAno) {
		SemestredoAno = semestredoAno;
	}


}