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
public class Ex20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Informe um ano: ");
        int ano = in.nextInt();
        
        System.out.println((ano % 4 == 0 && ano % 100 != 0) ? "Ano bissexto" : "Ano não bissexto");
    }
}
