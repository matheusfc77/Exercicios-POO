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
public final class Memoria {
    private String marca;
    private String modelo;
    private double capacidade;
    private double velocidade;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca.length() == 0)
            throw new IllegalArgumentException("Marca da memória deve ser informada");
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo.length() == 0)
            throw new IllegalArgumentException("Modelo da memória deve ser informada");
        this.modelo = modelo;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        if (capacidade <= 0)
            throw new IllegalArgumentException("Capacidade da memória deve ser maior que 0");
        this.capacidade = capacidade;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        if (velocidade <= 0)
            throw new IllegalArgumentException("Velocidade da memória deve ser maior que 0");
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Memoria{" + "marca=" + marca + ", modelo=" + modelo + ", capacidade=" + capacidade + ", velocidade=" + velocidade + '}';
    }
    
}
