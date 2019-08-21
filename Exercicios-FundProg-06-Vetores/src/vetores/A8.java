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
public class A8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma = 0;
        int mult = 1;
        
        System.out.println("Informe cinco números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("n%d: ", i+1);
            numeros[i] = in.nextInt();
            soma += numeros[i];
            mult *= numeros[i];
        }
        
        System.out.print("Números informados: ");
        for (int i: numeros)
            System.out.printf("%d ", i);
        
        System.out.printf("%nSoma: %d%n", soma);
        System.out.printf("Multiplicação: %d%n", mult);
        
        in.close();
    }
}
