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
public class Conta {
    private String banco;
    private int agencia;
    private int numConta;
    private double saldo;

    public boolean deposito(double valor) {
        if (this.numConta != 0) {
            this.saldo += valor;
            return true;
        } else 
            return false;
    }
    
    public boolean saque(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else
            return false;
    }
    
    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" + "banco=" + banco + ", agencia=" + agencia + ", numConta=" + numConta + ", saldo=" + saldo + '}';
    }
    
}
