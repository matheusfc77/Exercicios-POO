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
public class Motor {
    private String marca;
    private double potencia;
    private int cilindros;
    private String combustivel;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca.length() == 0)
            throw new IllegalArgumentException("Marca do motor deve ser informada");
        this.marca = marca;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        if (potencia <= 0)
            throw new IllegalArgumentException("Potência deve ser maior que zero");
        this.potencia = potencia;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        if (cilindros <= 0)
            throw new IllegalArgumentException("Cilindros devem ser informados");
        this.cilindros = cilindros;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        if (combustivel.length() == 0)
            throw new IllegalArgumentException("Combustível deve ser informado");
        this.combustivel = combustivel;
    }

    @Override
    public String toString() {
        return "Motor{" + "marca=" + marca + ", potencia=" + potencia + ", cilindros=" + cilindros + ", combustivel=" + combustivel + '}';
    }
}
