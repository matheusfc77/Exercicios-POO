/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FundProg_05_EstruturasDeRepeticao;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class D35 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int quant;
        int cod;
        double preco = 0;
        ArrayList<Double> precos = new ArrayList();
        double total = 0;
        
        System.out.println("Digite \"0\" no campo cógigo para encerrar a conta");
        System.out.print("Código: ");
        cod = in.nextInt();   
        
        while (cod != 0) {
            System.out.print("Quantidade: ");
            quant = in.nextInt();
            
            switch (cod) {
                case 105:
                    preco = quant*1;
                    break;
                case 100:
                case 103:
                    preco = quant*1.2;
                    break;
                case 101:
                case 104:
                    preco = quant*1.3;
                    break;
                case 102:
                    preco = quant*1.5;
            }
            
            precos.add(preco); 
            total += preco;
            System.out.print("Código: ");
            cod = in.nextInt();
        }
        
        int n = precos.size();
        for (int i = 0; i < n; i++) {
            System.out.printf("%nItem %d: R$ %.2f", i+1, precos.get(i));
        }
        
        System.out.printf("%nTotal: R$ %.2f%n", total);
    }
}
