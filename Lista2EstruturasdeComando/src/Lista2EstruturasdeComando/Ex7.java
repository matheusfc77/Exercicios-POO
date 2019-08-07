/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista2EstruturasdeComando;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class Ex7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numeros = new int[3];
        
        System.out.println("Informe três números");
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Informe n%d: ", i+1);
            numeros[i] = in.nextInt();
        }
        
        Arrays.sort(numeros);
        
        System.out.print("Números em ordem decrescente: ");
        for (int i = 2; i >= 0; i--)
            System.out.printf("%d ", numeros[i]);
        
        System.out.println();
    }   
    
}
