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
public class TesteAcademico {
    public static void main(String[] args) {
        Avaliacao a1 = new Avaliacao();
        a1.matricula.aluno.setNome("Mathues");
        a1.matricula.disciplinaLecionada.disciplina.fase.curso.setNome("BCC");
        a1.professor.setNome("Curvello");
        a1.setNota(8.5);
        a1.setPeso(2);
        System.out.println(a1);
    }
}
