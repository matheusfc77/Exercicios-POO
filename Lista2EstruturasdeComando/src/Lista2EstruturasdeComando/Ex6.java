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
public class Ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int aux;
        
        System.out.print("Informe um número: ");
        int n = in.nextInt();
        
        if (n % 2 == 0)
            System.out.printf("Número %d transformado em ímpar: %d%n", n, n+1);
        else
            System.out.printf("Número %d transformado em par: %d%n", n, n+1);
    }
}
