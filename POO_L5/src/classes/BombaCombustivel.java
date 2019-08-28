/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Arrays;

/**
 *
 * @author matheus
 */
public class BombaCombustivel {
    private int tipo;
    private double valorLitro;
    private double[] quantComb = {1000, 1000, 1000, 1000};

    public BombaCombustivel() {
        this.tipo = 1;
        this.valorLitro = 3.49;
    }
    
    private boolean validaParametro(double p) {
        if (p > 0)
            return true;
        else
            return false;
    }
    
    private boolean validaParametroTipo(int tipo) {
        if (tipo > 0 && tipo < 5)
            return true;
        else
            return false;
    }
    
    public double abastecerPorValor(double vlr) {
        if (validaParametro(vlr) && atualizaQuantidadeComb(vlr/getValorLitro())) 
            return vlr / getValorLitro();
        else
            return 0;
    }
    
    public double abastecerPorLitro(double litros) {
        if (validaParametro(litros) && atualizaQuantidadeComb(litros)) 
            return litros * getValorLitro(); 
        else
            return 0;
    }
    
    private boolean atualizaQuantidadeComb(double litros) {
        if (this.quantComb[getTipo()-1] > litros) {
            this.quantComb[getTipo()-1] -= litros;
            return true;
        } else
            return false;
    }
    
    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        if (validaParametroTipo(tipo))
           this.tipo = tipo;
    }

    public double getValorLitro() {
        return valorLitro;
    }

    public void setValorLitro(double valorLitro) {
        if (validaParametro(valorLitro))
            this.valorLitro = valorLitro;
    }

    @Override
    public String toString() {
        return "BombaCombustivel{" + "tipo=" + tipo + ", valorLitro=" + valorLitro + ", quantComb=" + Arrays.toString(quantComb) + '}';
    }
}
