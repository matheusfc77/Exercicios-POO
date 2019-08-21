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
public class A4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numeros = new int[4];
        int soma = 0;
        
        System.out.println("Informe quatro notas:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("n%d: ", i+1);
            numeros[i] = in.nextInt();
            soma += numeros[i];
        }
        
        System.out.print("Notas informadas: ");
        for (int i: numeros)
            System.out.printf("%d ", i);
        
        System.out.printf("%nMédia: %.2f%n", (double) soma/numeros.length);
        
        in.close();
    }
}
