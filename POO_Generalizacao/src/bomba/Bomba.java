/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomba;

/**
 *
 * @author matheus
 */
public class Bomba {
    private double totalLitros;
    private double valorLitro;
    
    public boolean abastecerPorLitro(int litros) {
        if (litros > 0 && this.totalLitros >= litros) {
            this.totalLitros -= litros;
            return true;
        } else
            return false;
    }

    public boolean abastecerPorValor(double valor) {
        if (this.valorLitro != 0 && valor > 0 && valor / this.valorLitro <= this.totalLitros) {
            this.totalLitros -= valor / this.valorLitro;
            return true;
        } else
            return false;
    }
    
    public double getTotalLitros() {
        return totalLitros;
    }

    public void setTotalLitros(double totalLitros) {
        this.totalLitros = totalLitros;
    }

    public double getValorLitro() {
        return valorLitro;
    }

    public void setValorLitro(double valorLitro) {
        this.valorLitro = valorLitro;
    }
    
}
