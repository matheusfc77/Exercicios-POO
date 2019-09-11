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
public abstract class ContaBancaria {
    protected Banco banco;
    private int agencia;
    private int numeroDaConta;
    private double saldo;
    protected Pessoa correntista;

    public ContaBancaria(int codigo, String nomeBanco, int numeroAgencias, int agencia, int numeroDaConta, double saldo, String nomePessoa, String endereco) {
        if (agencia < 1)
            throw new IllegalArgumentException("Número da agência deve ser maior que 0");
        
        if (numeroDaConta < 10000)
            throw new IllegalArgumentException("Número da conta deve ser maior ou igual a 10000");
        
        if (saldo < 0)
            throw new IllegalArgumentException("Saldo deve ser maior ou igual a 0");
        
        this.banco = new Banco(codigo, nomeBanco, numeroAgencias);
        this.agencia = agencia;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.correntista = new Pessoa(nomePessoa, endereco);
    }

    public boolean doposito(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            return true;
        } else
            return false;
    }
    
    public boolean saque(double valor) {
        if (valor > 0 && this.saldo - valor >= 0) {
            this.saldo -= valor;
            return true;
        } else
            return false;
    }
    
    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia < 1)
            throw new IllegalArgumentException("Número da agência deve ser maior que 0");
        this.agencia = agencia;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        if (numeroDaConta < 10000)
            throw new IllegalArgumentException("Número da conta deve ser maior ou igual a 10000");
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0)
            throw new IllegalArgumentException("Saldo deve ser maior ou igual a 0");
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" + "banco=" + banco + ", agencia=" + agencia + ", numeroDaConta=" + numeroDaConta + ", saldo=" + saldo + ", correntista=" + correntista + '}';
    }
    
}
