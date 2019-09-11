/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computador;

/**
 *
 * @author matheus
 */
public final class Gabinete {
    private String modelo;
    private String tipo;
    private int baias;
    protected PlacaMae placaMae;
    
    public Gabinete() {
        placaMae = new PlacaMae();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getBaias() {
        return baias;
    }

    public void setBaias(int baias) {
        this.baias = baias;
    }

    @Override
    public String toString() {
        return "Gabinete{" + "modelo=" + modelo + ", tipo=" + tipo + ", baias=" + baias + ", placaMae=" + placaMae + '}';
    }
    
}
