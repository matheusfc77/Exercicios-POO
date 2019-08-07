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
public class Ex11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Informe a sua altura em metros: ");
        double alt = Double.parseDouble(in.nextLine());
        
        System.out.printf("Seu peso ideal é %.2f kg%n", 72.7*alt-58);
    }
}
