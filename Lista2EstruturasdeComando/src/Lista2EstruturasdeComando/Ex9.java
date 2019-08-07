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
public class Ex9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double pesoIdeal;
        
        System.out.print("Informe sua altura (m): ");
        double alt = Double.parseDouble(in.nextLine());
        System.out.print("Informe seu peso (kg): ");
        double peso = Double.parseDouble(in.nextLine());
        System.out.print("Informe seu sexo (M/F): ");
        String sexo = in.nextLine();
        
        pesoIdeal = (sexo.equalsIgnoreCase("M")) ? 72.7*alt - 58 : 62.1*alt - 44.7;
        
        System.out.printf("%nAltura: %.2f m%nPeso: %.2f kg%n", alt, peso);
        System.out.println((sexo.equalsIgnoreCase("F")) ? "Feminino" : "Masculino");
        System.out.printf("Peso Ideal: %.2f kg", pesoIdeal);
        
        if (peso > pesoIdeal)
            System.out.println("\nVocê está acima do peso!");
        else if (peso < pesoIdeal)
            System.out.println("\nVocê está abaixo do peso!");
        else
            System.out.println("\nVocê possui peso ideal!");
    }
}
