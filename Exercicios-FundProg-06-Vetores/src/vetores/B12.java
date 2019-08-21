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
public class B12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numPV = 0;
        
        System.out.print("Informe palavras separadas por \";\": ");
        String palavras = in.nextLine();
        
        for (int i = 0; i < palavras.length(); i++) {
            if (";".equals(palavras.substring(i, i+1)))
                numPV++;
        }
        
        String[] p = new String[numPV+1];
        p = palavras.split(";");
        
        System.out.print("Palavras informadas: ");
        for (String plv: p)
            System.out.printf("%s ", plv);
        
        System.out.println();
        in.close();
    }
}
