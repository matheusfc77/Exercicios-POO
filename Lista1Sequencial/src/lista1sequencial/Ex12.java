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
public class Ex12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Informe a altura em metros: ");
        double alt = Double.parseDouble(in.nextLine());
        System.out.println("Peso ideal");
        System.out.printf("Para homens: %.2f kg%n", 72.7*alt-58);
        System.out.printf("Para mulheres: %.2f kg%n", 62.1*alt-44.7);
    }
}
