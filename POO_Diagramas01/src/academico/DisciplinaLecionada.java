/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academico;

import java.util.ArrayList;

/**
 *
 * @author matheus
 */
public class DisciplinaLecionada {
    private int ano;
    private int sem;
    protected ArrayList<Professor> professores;
    protected Disciplina disciplina;
    
    public DisciplinaLecionada() {
        professores = new ArrayList();
        disciplina = new Disciplina();
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getSem() {
        return sem;
    }

    public void setSem(int sem) {
        this.sem = sem;
    }

    @Override
    public String toString() {
        return "DisciplinaLecionada{" + "ano=" + ano + ", sem=" + sem + ", professores=" + professores + ", disciplina=" + disciplina + '}';
    }
    
}
