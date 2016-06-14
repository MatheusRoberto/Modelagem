package Universidade;

import java.util.ArrayList;
import java.util.Iterator;

public class Historico {

	private ArrayList<DisciplinaCompletas> historico = new ArrayList<DisciplinaCompletas>();
	
    public Historico() {
    }
    
    protected void adicionarDisciplina(Disciplina d, int n) {
		historico.add(new DisciplinaCompletas(d, n));
	}
    
    protected int contaCredito() {
    	int total = 0;
		for (Iterator<DisciplinaCompletas> iterator = historico.iterator(); iterator.hasNext();) {
			DisciplinaCompletas disciplinaCompletas = (DisciplinaCompletas) iterator.next();
			total += disciplinaCompletas.getDisciplina().getCredito();
		}
		return total;
	}

	protected ArrayList<DisciplinaCompletas> getHistorico() {
		return historico;
	}

	protected void setHistorico(ArrayList<DisciplinaCompletas> historico) {
		this.historico = historico;
	}


}