/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author matheus
 */
public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }
    
    public void fazerAniversario() {
        this.idade++;
        if (this.idade < 21)
            altura += 0.5;
    }
    
    public void envelhecer(int anos) {
        setIdade(getIdade() + anos);
    }

    public void engordar(double kilos) {
        setPeso(getPeso() + kilos);
    }
    
    public void emagrecer(double kilos) {
        setPeso(getPeso() - kilos);
    }
    
    public void crescer(double alt) {
        setAltura(getAltura() + alt);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() > 2)
            this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > -1)
            this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso > 0)
            this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0)
            this.altura = altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", peso=" + peso + ", altura=" + altura + '}';
    }
}
