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
public class A5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] caracteres = new String[10];
        int numCons = 0;
        
        System.out.println("Digite dez caracteres:");
        for (int i = 0; i < caracteres.length; i++) {
            System.out.printf("c%d: ", i+1);
            caracteres[i] = in.next();
        }
        
        System.out.print("\nConsoantes informadas: ");
        for (String c: caracteres) {
            if (!("a".equalsIgnoreCase(c) || "e".equalsIgnoreCase(c) || "i".equalsIgnoreCase(c) || "o".equalsIgnoreCase(c) || "u".equalsIgnoreCase(c))) {
                System.out.print(c + " ");
                numCons++;
            }
        }
        
        System.out.printf("%nNúmero de consoantes: %d%n", numCons);
        
        in.close();
    }
}
