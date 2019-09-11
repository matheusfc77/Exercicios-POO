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
public final class ContaEspecial extends ContaBancaria {
    private int diasSemJuros;
    private double limite;
    protected CartaoDeCredito cartao;

    public ContaEspecial(int codigo, String nomeBanco, int numeroAgencias, int agencia, int numeroDaConta, double saldo, String nomePessoa, String endereco, int diasSemJuros, double limite) {
        super(codigo, nomeBanco, numeroAgencias, agencia, numeroDaConta, saldo, nomePessoa, endereco);
        
        if (diasSemJuros < 0)
            throw new IllegalArgumentException("Dias sem juros devem ser maior ou igual a 0");
        
        if (limite < 0)
            throw new IllegalArgumentException("Limite deve ser maior ou igual a 0");
        
        this.cartao = new CartaoDeCredito();
        this.diasSemJuros = diasSemJuros;
        this.limite = limite;
    }
    
    public boolean dopositoEspecial(double valor) {
        if (valor > 0) {
            super.setSaldo(super.getSaldo() + valor);
            return true;
        } else
            return false;
    }
    
    public boolean saqueEspecial(double valor) {
        if (valor > 0 && super.getSaldo() + this.getLimite() >= valor) {
            super.setSaldo(super.getSaldo() - valor);
            return true;
        } else
            return false;
    }
    
    public int getDiasSemJuros() {
        return diasSemJuros;
    }

    public void setDiasSemJuros(int diasSemJuros) {
        if (diasSemJuros < 0)
            throw new IllegalArgumentException("Dias sem juros devem ser maior ou igual a 0");
        this.diasSemJuros = diasSemJuros;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        if (limite < 0)
            throw new IllegalArgumentException("Limite deve ser maior ou igual a 0");
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "ContaEspecial{" + "diasSemJuros=" + diasSemJuros + ", limite=" + limite + ", cartao=" + cartao.toString() + super.toString() + '}';
    }
    
}
