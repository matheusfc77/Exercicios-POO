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
public class Ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Informe um número: ");
        int n1 = in.nextInt();
        System.out.print("Informe novamente um número: ");
        int n2 = in.nextInt();
        
        if (n1 > n2)
            System.out.printf("Maior número: %d%n", n1);
        else if (n2 > n1)
            System.out.printf("Maior número: %d%n", n1);
        else 
            System.out.println("Números iguais");
    }
}
