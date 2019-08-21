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
public class B10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Digite um texto: ");
        String text = in.nextLine();
        
        String[] t = new String[text.length()];
        for (int i = 0; i < text.length(); i++)
            t[i] = text.substring(i, i+1);
        
        System.out.print("[");
        for (String c: t)
            System.out.printf(" %s,", c);
        
        System.out.println("]");
        in.close();
    }
}
