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
public class Ex16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double media;
        
        System.out.print("Informe a primeira nota: ");
        double n1 = Double.parseDouble(in.nextLine());
        System.out.print("Informe a segunda nota: ");
        double n2 = Double.parseDouble(in.nextLine());
        
        media = (n1 + n2) / 2;
        
        if (media < 3)
            System.out.println("Reprovado");
        else if (media < 7) 
            System.out.println("Exame");
        else 
            System.out.println("Aprovado");
    }
}
