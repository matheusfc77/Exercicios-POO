/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computador;

/**
 *
 * @author matheus
 */
public class Teste {
    public static void main(String[] args) {
        Computador cm = new Computador();
        cm.setModelo("A515");
        cm.setMarca("Acer");
        cm.gabinete.placaMae.memoria.setVelocidade(1800);
        cm.mouse.setTipo("Sem fio");
        cm.monitor.setMarca("HP");
        System.out.println(cm);
    
    }
}
