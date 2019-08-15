/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FundProg_05_EstruturasDeRepeticao;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class D34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n;
        int count = 1;
        int[] intervalos = new int[4];
        
        System.out.println("Digite um número negativo para finalizar as entradas");
        do {
            System.out.printf("N%d: ", count);
            n = in.nextInt();
            
            if (n > 75 && n < 101) 
                intervalos[3]++;
            else if (n > 50)
                intervalos[2]++;
            else if (n > 25)
                intervalos[1]++;
            else if (n > -1)
                intervalos[0]++;
            
            count++;
            
        } while (n > -1);
        
        System.out.println("Quantidade de números por intervalo");
        System.out.println("0-25  26-50  51-75  76-100");
        for (int i = 0; i < intervalos.length; i++)
            System.out.printf(" %d\t", intervalos[i]);
    }
}
