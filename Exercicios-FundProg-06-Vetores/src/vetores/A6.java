/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author mathe
 */
public class A6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numeros = new int[20];
        ArrayList<Integer> pares = new ArrayList();
        ArrayList<Integer> impares = new ArrayList();
        
        System.out.println("Informe 20 números:");
        for (int i = 0; i < numeros.length; i++) {
           System.out.printf("n%d: ", i+1);
           numeros[i] = in.nextInt();
           
           if (numeros[i] % 2 == 0)
               pares.add(numeros[i]);
           else
               impares.add(numeros[i]);
        }
        
        System.out.print("\nVetor informado:");
        for (int i: numeros)
            System.out.printf(" %d", i);
        
        System.out.print("\nPares:");
        for (int i: pares)
            System.out.printf(" %d", i);
        
        System.out.print("\nÍmpares:");
        for (int i: impares)
            System.out.printf(" %d", i);
        
        System.out.println();
        
        in.close();
    }
}
