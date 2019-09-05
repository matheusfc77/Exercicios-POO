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
public class ContaEspecial extends Conta {
    private int diasSemJuros;
    private double limite;
    
    public boolean saqueEspecial(double valor) {
        if (this.getSaldo() + this.limite >= valor) {
            this.setSaldo(this.getSaldo() - valor);
            return true;
        } else
            return false;
    }

    public int getDiasSemJuros() {
        return diasSemJuros;
    }

    public void setDiasSemJuros(int diasSemJuros) {
        this.diasSemJuros = diasSemJuros;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "ContaEspecial{" + "diasSemJuros=" + diasSemJuros + ", limite=" + limite + '}';
    }
    
}
