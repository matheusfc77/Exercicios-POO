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
public class Frequencia {
    private int dataHora;
    private int aulas;
    private int faltas;
    protected Professor professor;
    protected ArrayList<Matricula> matriculas;
    
    public Frequencia() {
        professor = new Professor();
        matriculas = new ArrayList();
    }

    public int getDataHora() {
        return dataHora;
    }

    public void setDataHora(int dataHora) {
        this.dataHora = dataHora;
    }

    public int getAulas() {
        return aulas;
    }

    public void setAulas(int aulas) {
        this.aulas = aulas;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    @Override
    public String toString() {
        return "Frequencia{" + "dataHora=" + dataHora + ", aulas=" + aulas + ", faltas=" + faltas + ", professor=" + professor + ", matriculas=" + matriculas + '}';
    }
    
}
