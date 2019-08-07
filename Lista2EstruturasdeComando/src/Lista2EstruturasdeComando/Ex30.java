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
public class Ex30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double p;
        
        System.out.print("Informe a quantidade (em kg) de morangos: ");
        double p1 = Double.parseDouble(in.nextLine());
        System.out.print("Informe a quantidade (em kg) de maças: ");
        double p2 = Double.parseDouble(in.nextLine());
        
        p = (p1 > 5) ? 2.2 * p1 : 2.5 * p1;
        p += (p2 > 5) ? 1.5 * p2 : 1.8 * p2;
        
        if (p1 + p2 > 8 || p > 25)
            p *= 0.9;
        
        System.out.printf("Preço final: R$ %.2f%n", p);
    }
}
