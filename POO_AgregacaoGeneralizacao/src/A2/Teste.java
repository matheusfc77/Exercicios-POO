/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A2;

/**
 *
 * @author matheus
 */
public class Teste {
    public static void main(String[] args) {
        Motor m1 = new Motor();
        try {
        m1.setCilindros(4);
        m1.setCombustivel("Etanol");
        m1.setMarca("Mercedes");
        m1.setPotencia(20000);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        System.out.println(m1);
        
        Pessoa p1 = new Pessoa();
        try {
            p1.setEndereco("Lugar qualquer");
            p1.setNome("José");
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        System.out.println(p1);
        
        Carro c1 = new Carro();
        try {
            c1.setAno(2019);
            c1.setCor("Cinza Metálico");
            c1.setFabricante("Audi");
            c1.setModelo("RSTT");
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        System.out.println("Carro com novos objetos: " + c1);
        
        Carro c2 = new Carro(p1, m1);
        System.out.println("Carro com objetos passados: " + c2);
    }
}
