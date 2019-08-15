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
public class D38 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Informe um número: ");
        String n = in.nextLine();
        char[] numeros = n.toCharArray();
        
        System.out.print("Número invertido: ");
        for (int i = numeros.length -1; i > -1; i--)
            System.out.printf("%s", numeros[i]);
        
        System.out.println();
        in.close();
    }
    
}
