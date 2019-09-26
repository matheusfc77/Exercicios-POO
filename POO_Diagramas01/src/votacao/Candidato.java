/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votacao;

/**
 *
 * @author matheus
 */
public class Candidato {
    protected Usuario cargo;
    
    public Candidato() {
        cargo = new Usuario();
    }

    @Override
    public String toString() {
        return "Candidato{" + "cargo=" + cargo + '}';
    }
    
}
