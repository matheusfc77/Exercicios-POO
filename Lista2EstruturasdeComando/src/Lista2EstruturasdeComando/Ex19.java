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
public class Ex19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double delta;
        
        System.out.print("Informe o coeficiente a: ");
        double a = Double.parseDouble(in.nextLine());
        
        if (a > 0) {
            System.out.print("Informe o coeficiente b: ");
            double b = Double.parseDouble(in.nextLine());
            System.out.print("Informe o coeficiente c: ");
            double c = Double.parseDouble(in.nextLine());
            
            delta = b*b - 4*a*c;
            if (delta == 0)
                System.out.printf("A raiz da equação é: %.1f%n", -b / 2*a);
            else if (delta > 0) 
                System.out.printf("Raízes da equação: %.1f e %.1f%n", (-b + Math.sqrt(delta)) / (2*a), (-b - Math.sqrt(delta)) / (2*a));
            else
                System.out.println("A equação não possui raízes reais");
        } else 
            System.out.println("A equação não é do segundo grau");
    }
}
