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
public final class PlacaMae {
    private String marca;
    private String modelo;
    protected Processador processador;
    protected HD hd;
    protected Memoria memoria;
    
    public PlacaMae() {
        processador = new Processador();
        hd = new HD();
        memoria = new Memoria();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "PlacaMae{" + "marca=" + marca + ", modelo=" + modelo + ", processador=" + processador + ", hd=" + hd + ", memoria=" + memoria + '}';
    }
    
}
