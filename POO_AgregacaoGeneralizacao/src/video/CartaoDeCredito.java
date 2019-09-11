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
public final class CartaoDeCredito {
    private int numero;
    private String operadora;
    private double limite;
    private String tipoDeCartao;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero < 1000)
            throw new IllegalArgumentException("Número do cartão deve ser maior ou igual a 1000");
        this.numero = numero;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        if (operadora.length() == 0)
            throw new IllegalArgumentException("Operadora deve ser informada");
        this.operadora = operadora;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        if (limite < 0)
            throw new IllegalArgumentException("Limite deve ser maior ou igual a 0");
        this.limite = limite;
    }

    public String getTipoDeCartao() {
        return tipoDeCartao;
    }

    public void setTipoDeCartao(String tipoDeCartao) {
        if (tipoDeCartao.length() == 0)
            throw new IllegalArgumentException("Deve ser informado o tipo de cartão");
        this.tipoDeCartao = tipoDeCartao;
    }

    @Override
    public String toString() {
        return "CartaoDeCredito{" + "numero=" + numero + ", operadora=" + operadora + ", limite=" + limite + ", tipoDeCartao=" + tipoDeCartao + '}';
    }
    
}
