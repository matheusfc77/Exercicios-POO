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
public class Aluno extends Pessoa {
    protected ArrayList<Curso> cursos;
    
    public Aluno() {
        cursos = new ArrayList();
    }

    @Override
    public String toString() {
        return "Aluno{" + "cursos=" + cursos + '}';
    }
    
}
