/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class A2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numeros = new int[10];
        
        System.out.println("Informe dez números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("n%d: ", i+1);
            numeros[i] = in.nextInt();
        }
        
        System.out.print("Números em ordem inversa: ");
        for (int i = numeros.length - 1; i > -1; i--)
            System.out.printf("%d ", numeros[i]);
        
        System.out.println();
        
        in.close();
    }
}
