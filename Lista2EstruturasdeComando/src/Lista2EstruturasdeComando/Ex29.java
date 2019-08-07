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
public class Ex29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double p;
        
        System.out.print("Informe o número de litros: ");
        double l = Double.parseDouble(in.nextLine());
        System.out.print("Informe o tipo de combustível (A-álcool / G-gasolina): ");
        String t = in.next();
        
        if (t.equalsIgnoreCase("g")) {
            p = (l > 20) ? 2.5*l*0.95 : 2.5*l*0.97;
            System.out.printf("Valor total: R$ %.2f%n", p);
        } else {
            p = (l > 20) ? 1.9*l*0.94 : 1.9*l*0.96;
            System.out.printf("Valor total: R$ %.2f%n", p);
        }
    }
}
