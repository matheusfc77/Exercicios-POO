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
public class Ex15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int latas;
        
        System.out.print("Informe a área (em m2) a ser pintada: ");
        int area = in.nextInt();
        
        latas = (area%(3*18) == 0) ? area/(3*18) : area/(3*18)+1;
        System.out.printf("Quantidade de latas de tinta necessárias: %d%n", latas);
        System.out.printf("Preço total: R$ %.2f%n", latas*80.0);
    }
}
