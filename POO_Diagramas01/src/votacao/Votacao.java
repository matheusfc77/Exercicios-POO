/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votacao;

import java.util.ArrayList;

/**
 *
 * @author matheus
 */
public class Votacao {
    protected Usuario admin;
    protected ArrayList<Usuario> podeVotar;
    protected ArrayList<Usuario> votou;
    
    public Votacao() {
        admin = new Usuario();
        podeVotar = new ArrayList(10);
        votou =  new ArrayList(10);
    }

    @Override
    public String toString() {
        return "Votacao{" + "admin=" + admin + ", podeVotar=" + podeVotar + ", votou=" + votou + '}';
    }
    
}
