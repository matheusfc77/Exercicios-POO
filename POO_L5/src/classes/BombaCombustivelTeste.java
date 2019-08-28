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
public class BombaCombustivelTeste {
    public static void main(String[] args) {
        BombaCombustivel bomba = new BombaCombustivel();
        System.out.println(bomba.abastecerPorLitro(10));
        System.out.println(bomba.abastecerPorValor(50));
        System.out.println(bomba.toString());
        bomba.setTipo(3);
        bomba.setValorLitro(3.99);
        System.out.println(bomba.abastecerPorLitro(20));
        System.out.println(bomba.abastecerPorValor(-2));
        System.out.println(bomba.toString());
    }
}
