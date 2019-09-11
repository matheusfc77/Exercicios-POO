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
public final class HD {
    private String marca;
    private String modelo;
    private double capacidade;
    private int rpm;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca.length() == 0)
            throw new IllegalArgumentException("Marca do HD deve ser informado");
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo.length() == 0)
            throw new IllegalArgumentException("Modelo do HD deve ser informado");
        this.modelo = modelo;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        if (capacidade <= 0)
            throw new IllegalArgumentException("Capacidade do HD deve ser informado");
        this.capacidade = capacidade;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        if (rpm <= 0)
            throw new IllegalArgumentException("RPM do HD deve ser maior que 0");
        this.rpm = rpm;
    }

    @Override
    public String toString() {
        return "HD{" + "marca=" + marca + ", modelo=" + modelo + ", capacidade=" + capacidade + ", rpm=" + rpm + '}';
    }
    
}
