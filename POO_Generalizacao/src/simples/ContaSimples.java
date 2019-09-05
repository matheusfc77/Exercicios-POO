/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simples;

/**
 *
 * @author matheus
 */
public class ContaSimples extends Conta {
    private double saldoPoupanca;

    public boolean depositoPoupanca(double valor) {
        this.saldoPoupanca += valor;
        return true;
    }
    
    public boolean saquePoupanca(double valor) {
        if (this.saldoPoupanca >= valor) {
            this.saldoPoupanca -= valor;
            return true;
        } else
            return false;
    }
    
    public double getSaldoPoupanca() {
        return saldoPoupanca;
    }

    public void setSaldoPoupanca(double saldoPoupanca) {
        this.saldoPoupanca = saldoPoupanca;
    }

    @Override
    public String toString() {
        return "ContaSimples{" + "saldoPoupanca=" + saldoPoupanca + '}';
    }
    
}
