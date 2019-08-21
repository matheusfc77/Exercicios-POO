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
public class B16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] num = new int[10];
        int n;
        
        System.out.println("Informe dez valores inteiros contidos no intervalo de 0 a 20 (inclusive):");
        for (int i = 0; i < num.length; i++) {
            System.out.printf("n%d: ", i+1);
            n = in.nextInt();
            while (n < 0 || n > 20) {
                System.out.print("Número deve estar no itervalo de 0 a 20 (inclusive). Digite novamente: ");
                n = in.nextInt();
            }
            num[i] = n;
        }
        
        System.out.println("\n\"#\" de acordo com os números informados:");
        for (int i: num) {
            System.out.printf("%n%d: ", i);
            for (int j = 0; j < i; j++)
                System.out.print("#");
        }
        
        System.out.println();
        in.close();
    }
}
