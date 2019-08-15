/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FundProg_05_EstruturasDeRepeticao;

/**
 *
 * @author mathe
 */
public class C25 {
    public static void main(String[] args) {
        final double PRECO = 1.99;
        
        System.out.println("Loja Quase Dois - Tabela de Preços");
        for (int i = 1; i < 51; i++)
            System.out.printf("%n%d - R$ %.2f", i, i*PRECO);
        
        System.out.println();
    }
}
