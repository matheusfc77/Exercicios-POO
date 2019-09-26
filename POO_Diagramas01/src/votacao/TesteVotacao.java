/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votacao;

/**
 *
 * @author matheus
 */
public class TesteVotacao {
    public static void main(String[] args) {
        Votacao v1 = new Votacao();
        v1.admin.setEmail("m@gmail.com");
        v1.podeVotar.add(new Usuario());
        System.out.println(v1);
        
        Voto vt1 = new Voto();
        vt1.votacao.admin.setEmail("t@gmail.com");
        System.out.println(vt1);
        
        Validacao vl1 = new Validacao();
        vl1.usuario.setEmail("p@gmail.com");
        System.out.println(vl1);
    }
}
