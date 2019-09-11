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
public final class Pessoa {
    private String nome;
    private String endereco;

    public Pessoa(String nome, String endereco) {
        if (nome.length() == 0)
            throw new IllegalArgumentException("Nome do correntista deve ser informado");
        
        if (endereco.length() == 0)
            throw new IllegalArgumentException("Endereço do correntista deve ser informado");
        
        this.nome = nome;
        this.endereco = endereco;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() == 0)
            throw new IllegalArgumentException("Nome do correntista deve ser informado");
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if (endereco.length() == 0)
            throw new IllegalArgumentException("Endereço do correntista deve ser informado");
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", endereco=" + endereco + '}';
    }
}
