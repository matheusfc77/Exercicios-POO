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
public class Ex26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double aux;
        
        System.out.print("Informe um número: ");
        double n = Double.parseDouble(in.nextLine());
        aux = Math.ceil(n);
        
        System.out.println((n == aux) ? "Número inteiro" : "Número real");
    }
}
