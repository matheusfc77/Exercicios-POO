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
public class Ex17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double media;
        String conceito;
        String mens;
        
        System.out.print("Informe a primeira nota: ");
        double n1 = Double.parseDouble(in.nextLine());
        System.out.print("Informe a segunda nota: ");
        double n2 = Double.parseDouble(in.nextLine());
        
        media = (n1 + n2) / 2;
        
        if (media >= 9) {
            conceito = "A";
            mens = "Aprovado";
        } else if (media >= 7.5) {
            conceito = "B";
            mens = "Aprovado";
        } else if (media >= 6) {
            conceito = "C";
            mens = "Aprovado";
        } else if (media >= 4) {
            conceito = "D";
            mens = "Reprovado";
        } else {
            conceito = "E";
            mens = "Rerovado";
        }
        
        System.out.printf("%nNota1: %.1f", n1);
        System.out.printf("%nNota2: %.1f", n2);
        System.out.printf("%nMédia: %.1f", media);
        System.out.printf("%nConceito: %s", conceito);
        System.out.printf("%n%s%n", mens);
    }
}
