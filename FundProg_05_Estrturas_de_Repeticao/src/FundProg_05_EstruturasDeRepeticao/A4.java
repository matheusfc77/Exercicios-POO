/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FundProg_05_EstruturasDeRepeticao;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class A4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int anos = 0;
        int auxPop;
        double auxTaxa = 0;
        
        System.out.print("Informe a população da cidade A: ");
        int popA = Integer.parseInt(in.nextLine());
        System.out.print("Informe a taxa de crescimento da cidade A (em %): ");
        double taxaA = Double.parseDouble(in.nextLine());
        System.out.print("Informe a população da cidade B: ");
        int popB = Integer.parseInt(in.nextLine());
        System.out.print("Informe a taxa de crescimento da cidade B (em %): ");
        double taxaB = Double.parseDouble(in.nextLine());
        
        if (popA < popB && taxaA < taxaB) {
            System.out.println("Se população de B for maior que A então taxa de A deverá ser maior");
        } else if (popA > popB && taxaA > taxaB) {
            System.out.println("Se população de A for maior que B então taxa de B deverá ser maior");
        } else if (popA == popB) {
            System.out.println("Populações iguais");
        } else {
            if (popA < popB) {
                auxPop = popA;
                popA = popB;
                popB = auxPop;
                auxTaxa = taxaA;
                taxaA = taxaB;
                taxaB = auxTaxa;
            }
            
            while (popA >= popB) {
                popA *= (1 + (taxaA/100));
                popB *= (1 + (taxaB/100));
                anos++;
            }
            
            System.out.println("Número de anos até as populações se igualarem ou a menor ultrapassar a maior: " + anos);
        }
    }
}
