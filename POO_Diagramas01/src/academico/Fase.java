/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academico;

/**
 *
 * @author matheus
 */
public class Fase {
    private int semestre;
    protected Curso curso;
    
    public Fase() {
        curso = new Curso();
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "Fase{" + "semestre=" + semestre + ", curso=" + curso + '}';
    }
    
}
