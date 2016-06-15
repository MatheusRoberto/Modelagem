package Universidade;

import java.util.Date;

public class Doutorado extends Aluno {

    public Doutorado(String n, Date D, boolean s, String Ra, Endereco e) {
    	super(n, D, s, Ra, e);
    }
    
    private Tese tese;

}