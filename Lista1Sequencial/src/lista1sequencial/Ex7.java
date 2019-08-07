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
public class Ex7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Informe o comprimento em metros do lado do quadrado: ");
        double l = Double.parseDouble(in.nextLine());
        System.out.printf("Área: %.2f m2%n", l*l);
    }
}
