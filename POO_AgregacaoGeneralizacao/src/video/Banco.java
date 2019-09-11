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
public final class Banco {
    private int codigo;
    private String nome;
    private int numeroAgencias;

    public Banco(int codigo, String nome, int numeroAgencias) {
        if (codigo < 10000)
            throw new IllegalArgumentException("Cógido do banco deve ser maior ou igual a 10000");
        
        if (nome.length() == 0)
            throw new IllegalArgumentException("Nome do banco deve ser informado");
        
        if (numeroAgencias < 1)
            throw new IllegalArgumentException("Número da agência deve ser maior que 0");
        
        this.codigo = codigo;
        this.nome = nome;
        this.numeroAgencias = numeroAgencias;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo < 10000)
            throw new IllegalArgumentException("Cógido do banco deve ser maior ou igual a 10000");
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() == 0)
            throw new IllegalArgumentException("Nome do banco deve ser informado");
        this.nome = nome;
    }

    public int getNumeroAgencias() {
        return numeroAgencias;
    }

    public void setNumeroAgencias(int numeroAgencias) {
        if (numeroAgencias < 1)
            throw new IllegalArgumentException("Número da agência deve ser maior que 0");
        this.numeroAgencias = numeroAgencias;
    }

    @Override
    public String toString() {
        return "Banco{" + "codigo=" + codigo + ", nome=" + nome + ", numeroAgencias=" + numeroAgencias + '}';
    }
    
}
