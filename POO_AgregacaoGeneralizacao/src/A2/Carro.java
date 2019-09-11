/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A2;

/**
 *
 * @author matheus
 */
public class Carro {
    private String fabricante;
    private String modelo;
    private String cor;
    private int ano;
    protected Pessoa dono;
    protected Motor motor;

    public Carro() {
        dono = new Pessoa();
        motor = new Motor();
    }
    
    public Carro(Pessoa dono, Motor motor) {
        this.dono = dono;
        this.motor = motor;
    }
    
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        if (fabricante.length() == 0)
            throw new IllegalArgumentException("Fabricante deve ser informado");
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo.length() == 0)
            throw new IllegalArgumentException("Modelo deve ser informado");
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        if (cor.length() == 0)
            throw new IllegalArgumentException("Cor deve ser informada");
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano <= 1800)
            throw new IllegalArgumentException("Ano deve ser maior que 1800");
        this.ano = ano;
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Carro{" + "fabricante=" + fabricante + ", modelo=" + modelo + ", cor=" + cor + ", ano=" + ano + ", dono=" + dono + ", motor=" + motor + '}';
    }
}
