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
public class Avaliacao {
    private double nota;
    private double peso;
    protected Professor professor;
    protected Matricula matricula;
    
    public Avaliacao() {
        professor = new Professor();
        matricula = new Matricula();
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Avaliacao{" + "nota=" + nota + ", peso=" + peso + ", professor=" + professor + ", matricula=" + matricula + '}';
    }
    
}
