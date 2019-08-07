/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1sequencial;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class Ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Informe o primeiro número: ");
        int n1 = in.nextInt();
        System.out.printf("%nInforme o segundo número: ");
        int n2 = in.nextInt();
        
        System.out.printf("%nA soma dos número %d e %d é igual a %d%n", n1, n2, n1+n2);
    }
}
