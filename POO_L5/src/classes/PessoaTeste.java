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
public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Matheus", 19, 60, 170);
        System.out.println(p.toString());
        p.fazerAniversario();
        System.out.println(p.toString());
    }
}
