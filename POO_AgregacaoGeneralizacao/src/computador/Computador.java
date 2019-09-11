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
public class Computador extends EquipamentoEletronico {
    private String marca;
    private String modelo;
    protected Gabinete gabinete;
    protected Teclado teclado;
    protected Mouse mouse;
    protected Monitor monitor;

    public Computador() {
        gabinete = new Gabinete();
        teclado = new Teclado();
        mouse = new Mouse();
        monitor = new Monitor();
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
        return "Computador{" + "marca=" + marca + ", modelo=" + modelo + ", gabinete=" + gabinete + ", teclado=" + teclado + ", mouse=" + mouse + ", monitor=" + monitor + '}' + super.toString();
    }
    
}
