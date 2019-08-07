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
public class Ex10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Informe um número inteiro: ");
        int a = Integer.parseInt(in.nextLine());
        System.out.print("Informe novamente um número inteiro: ");
        int b = Integer.parseInt(in.nextLine());
        System.out.print("Informe um número real: ");
        double c = Double.parseDouble(in.nextLine());
        
        System.out.printf("2*%d * 0.5*%d = %.2f", a, b, (double) 2*a*0.5*b);
        System.out.printf("%n3*%d + %.2f = %.2f", a, c, 3*a+c);
        System.out.printf("%n%.2f elevado ao cubo = %.2f%n", c, Math.pow(c, 3));
    }
}
