package Universidade;

import java.util.ArrayList;

public class Grade {
	
	private ArrayList<Disciplina> grade = new ArrayList<Disciplina>();

    public Grade() {
    }

	protected ArrayList<Disciplina> getGrade() {
		return grade;
	}

	protected void setGrade(ArrayList<Disciplina> grade) {
		this.grade = grade;
	}


}