/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1sequencial;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class Ex16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int latas;
        int galoes;
        
        System.out.print("Informe a área (em m2) a ser pintada: ");
        int area = in.nextInt();
        
        latas = (area%(6*18) == 0) ? area/(6*18) : area/(6*18)+1;
        galoes = (area%(Math.round(6*3.6)) == 0) ? (int)(area/(6*3.6)) : (int)(area/(6*3.6))+1;
        
        System.out.println("Caso seja escolhido latas:");
        System.out.printf("\tQuantidade: %d%n", latas);
        System.out.printf("\tPreço total: R$ %.2f%n", latas*80.0);
    
        System.out.println("Caso seja escolhido galões:");
        System.out.printf("\tQuantidade: %d%n", galoes);
        System.out.printf("\tPreço total: R$ %.2f%n", galoes*25.0);
    }
}
