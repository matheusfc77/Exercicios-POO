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
public class Ex10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numeros = new int[3];
        
        System.out.println("Informe três números");
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Informe n%d: ", i+1);
            numeros[i] = in.nextInt();
        }
        
        Arrays.sort(numeros);
        
        System.out.printf("Menor número: %d%n", numeros[0]);
        System.out.printf("Maior número: %d%n", numeros[2]);
    }
}
