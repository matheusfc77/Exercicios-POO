/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FundProg_05_EstruturasDeRepeticao;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class C27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double preco;
        double dinheiro;
        double total = 0;
        int count = 1;
        
        System.out.printf("Lojas Tabajara%nDigite 0 para indicar o fim dos produtos%n");
        
        do {
            System.out.printf("Produto %d: R$ ", count);
            preco = Double.parseDouble(in.nextLine());
            count++;
            total += preco;
        } while (preco != 0);
        
        System.out.print("Dinheiro: R$ ");
        dinheiro = Double.parseDouble(in.nextLine());
        if (dinheiro >= total)
            System.out.printf("%nTroco: R$ %.2f%n", dinheiro - total);
        else 
            System.out.println("\nQuantia insuficiente");
        
        
        in.close();
    }
}
