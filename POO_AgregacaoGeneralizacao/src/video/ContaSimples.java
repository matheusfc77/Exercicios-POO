/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video;

/**
 *
 * @author matheus
 */
public final class ContaSimples extends ContaBancaria{
    private double saldoPoupanca;

    public ContaSimples(int codigo, String nomeBanco, int numeroAgencias, int agencia, int numeroDaConta, double saldo, String nomePessoa, String endereco) {
        super(codigo, nomeBanco, numeroAgencias, agencia, numeroDaConta, saldo, nomePessoa, endereco);
    }

    public boolean dopositoPoupanca(double valor) {
        if (valor > 0) {
            this.saldoPoupanca += valor;
            return true;
        } else
            return false;
    }
    
    public boolean saquePoupanca(double valor) {
        if (valor > 0 && this.saldoPoupanca - valor >= 0) {
            this.saldoPoupanca -= valor;
            return true;
        } else
            return false;
    }
    
    public double getSaldoPoupanca() {
        return saldoPoupanca;
    }

    public void setSaldoPoupanca(double saldoPoupanca) {
        if (saldoPoupanca < 0)
            throw new IllegalArgumentException("Saldo da Poupança deve ser maior ou igual a 0");
        this.saldoPoupanca = saldoPoupanca;
    }

    @Override
    public String toString() {
        return "ContaSimples{" + "saldoPoupanca=" + saldoPoupanca + "} ContaBancaria{" + super.toString();
    }
    
}