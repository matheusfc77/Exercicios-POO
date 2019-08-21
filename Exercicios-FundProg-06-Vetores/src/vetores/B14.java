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
public class B14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numFin = new int[20];
        int[] num1 = new int[10];
        int[] num2 = new int[10];
        
        System.out.println("Informe dez valores:");
        for (int i = 0; i < num1.length; i++) {
            System.out.printf("n%d: ", i+1);
            num1[i] = in.nextInt();
        }
        
        System.out.println("\nInforme dez valores:");
        for (int i = 0; i < num2.length; i++) {
            System.out.printf("n%d: ", i+1);
            num2[i] = in.nextInt();
        }
        
        int aux1 = 0;
        int aux2 = 0;
        int aux3 = 0;
        while (aux1 < 10) {
            if (aux2 % 2 == 0) {
                numFin[aux3] = num1[aux1];
                aux3++;
                aux2++;
            } else {
                numFin[aux3] = num2[aux1];
                aux1++;
                aux2 = 0;
                aux3++;   
            }
        }
        System.out.println("Valores intercalados: ");
        for (int i: numFin)
            System.out.printf("%d ", i);
        
        System.out.println();
        in.close();
    }
}
