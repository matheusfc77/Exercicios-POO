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
public class Matricula {
    private int numero;
    protected DisciplinaLecionada disciplinaLecionada;
    protected Aluno aluno;
    
    public Matricula(){
        disciplinaLecionada = new DisciplinaLecionada();
        aluno = new Aluno();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Matricula{" + "numero=" + numero + ", disciplinaLecionada=" + disciplinaLecionada + ", aluno=" + aluno + '}';
    }
    
}
