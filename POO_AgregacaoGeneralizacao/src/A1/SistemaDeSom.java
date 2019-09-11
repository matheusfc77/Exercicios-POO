/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A1;

/**
 *
 * @author matheus
 */
public class SistemaDeSom extends EquipamentoEletronico {
    private String marca;
    private String modelo;
    private double potencia;
    
    public SistemaDeSom() {
        marca = null;
        modelo = null;
        potencia = 0;
    }

    public SistemaDeSom(String marca, String modelo, double potencia, double tensao, double consumo) {
        super(tensao, consumo);
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca.length() == 0)
            throw new IllegalArgumentException("Marca deve ser informada");
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo.length() == 0)
            throw new IllegalArgumentException("Modelo deve ser informado");
        this.modelo = modelo;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        if (potencia <= 0)
            throw new IllegalArgumentException("Potência deve ser maior que 0");
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "SistemaDeSom{" + "marca=" + marca + ", modelo=" + modelo + ", potencia=" + potencia + '}' + super.toString();
    }
}
