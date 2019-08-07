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
public class Ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Digite \"F\" ou \"M\": ");
        String letra = in.nextLine();
        
        if (letra.equals("F")) 
            System.out.println("F - Feminino");
        else
            System.out.println("M - Masculino");
    }
}
