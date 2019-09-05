/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author matheus
 */
public class Tartaruga extends Reptil {
    private int idade;
    
    @Override
    public String mover() {
        return "Está se movendo lentamente";
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
