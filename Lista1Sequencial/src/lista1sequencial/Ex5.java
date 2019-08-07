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
public class Ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Informe a distância em metros: ");
        double d = Double.parseDouble(in.nextLine());
        
        System.out.printf("%.2fm em centímetros: %.2f%n", d, d*100);
    }
}
