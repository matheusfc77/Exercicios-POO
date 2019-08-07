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
public class Ex24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double m;
        
        System.out.print("Informe a nota1: ");
        double n1 = Double.parseDouble(in.nextLine());
        System.out.print("Informe a nota2: ");
        double n2 = Double.parseDouble(in.nextLine());
        System.out.print("Informe a nota3: ");
        double n3 = Double.parseDouble(in.nextLine());
        
        m = (n1+n2+n3) / 3;
        
        if (m == 10)
            System.out.println("Aprovado com distinção");
        else if (m >= 7)
            System.out.println("Aprovado");
        else
            System.out.println("Reprovado");
    }
}
