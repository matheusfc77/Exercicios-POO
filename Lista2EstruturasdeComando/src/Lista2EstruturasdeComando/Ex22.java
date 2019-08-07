/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista2EstruturasdeComando;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class Ex22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] num = new int[3];
        
        System.out.print("Informe um número menor que 1000: ");
        int n = in.nextInt();
        
        for (int i = 2; i >= 0; i--) {
            num[i] = (int) (n / Math.pow(10, i));
            n %= (int) Math.pow(10, i);
        }
        
        System.out.printf("Centenas: %d\tDezenas: %d\tUnidades: %d%n", num[2], num[1], num[0]);
    }
}
