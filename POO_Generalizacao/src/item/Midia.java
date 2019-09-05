/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item;

/**
 *
 * @author matheus
 */
public class Midia extends Item {
    private String gravadores;
    private double duração;

    public String getGravadores() {
        return gravadores;
    }

    public void setGravadores(String gravadores) {
        this.gravadores = gravadores;
    }

    public double getDuração() {
        return duração;
    }

    public void setDuração(double duração) {
        this.duração = duração;
    }

    @Override
    public String toString() {
        return "Midia{" + "gravadores=" + gravadores + ", dura\u00e7\u00e3o=" + duração + '}';
    }
    
}
