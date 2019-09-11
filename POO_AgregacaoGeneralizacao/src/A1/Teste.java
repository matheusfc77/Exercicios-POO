/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A1;

/**
 *
 * @author matheus
 */
public class Teste {
    public static void main(String[] args) {
        HomeTheater hm = new HomeTheater();
        try {
            hm.sistemaSom.setConsumo(200);
            hm.sistemaSom.setTensao(1200);
            hm.sistemaVideo.setTensao(100);
            hm.sistemaVideo.setConsumo(1000);
            hm.sistemaSom.setMarca("HP");
            hm.sistemaSom.setModelo("300");
            hm.sistemaSom.setPotencia(900);
            hm.sistemaVideo.setMarca("LG");
            hm.sistemaVideo.setModelo("300");
            hm.sistemaVideo.setResolucao("1200X900");
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
        }
        System.out.println(hm);
    }
}
