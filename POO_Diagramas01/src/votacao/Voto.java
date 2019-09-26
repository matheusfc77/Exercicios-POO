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
public class Voto {
    protected Votacao votacao;
    
    public Voto() {
        votacao =  new Votacao();
    }

    @Override
    public String toString() {
        return "Voto{" + "votacao=" + votacao + '}';
    }
    
}
