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
public class C29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Informe a tabuada: ");
        int t = in.nextInt();
        System.out.print("Começa por: ");
        int i = in.nextInt();
        System.out.print("Termina em: ");
        int f = in.nextInt();
        
        if (f > i) {
            for (int j = i; j <= f; j++) 
                System.out.printf("%d x %d = %d%n", t, j, t*j);
        } else
            System.out.println("Fim deve ser maior que início");
        
        in.close();
    }
}
