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
public class Ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Informe o valor do raio (m): ");
        double r = Double.parseDouble(in.nextLine());
        System.out.printf("A área do círculo com raio %.2fm é: %.2fm2%n", r, Math.PI*Math.pow(r, 2));
    }
}
