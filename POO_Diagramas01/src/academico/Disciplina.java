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
public class Disciplina {
    private String nome;
    protected Fase fase;
    
    public Disciplina() {
        fase = new Fase();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Disciplina{" + "nome=" + nome + ", fase=" + fase + '}';
    }
    
}
