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
public class Ex13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double excesso = 0;
        double multa = 0;
        
        System.out.print("Informe o peso em kilogramas: ");
        double peso = Double.parseDouble(in.nextLine());
        
        if(peso > 50) {
            excesso = peso - 50;
            multa = excesso * 4;
            System.out.printf("Excesso: %.2f kg%nMulta: R$ %.2f%n", excesso, multa);
        } else
            System.out.printf("Excesso: %.2f%nMulta: %.2f%n", excesso, multa);
    }
}
