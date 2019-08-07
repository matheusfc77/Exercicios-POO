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
public class Ex9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Informe a temperatura em Farenheit: ");
        int t = in.nextInt();
        System.out.printf("Temperatura em Celsius: %d%n", 5*(t-32)/9);
    }
}
