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
public class Ex27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double auxI;
        double ope = 0;
        
        System.out.print("Informe um número: ");
        double n1 = Double.parseDouble(in.nextLine());
        System.out.print("Informe um número: ");
        double n2 = Double.parseDouble(in.nextLine());
        System.out.print("Informe a operação: ");
        String o = in.next();
        
        switch (o) {
            case "+":
                ope = n1 + n2;
                break;
            case "-":
                ope = n1 - n2;
                break;
            case "*":
                ope = n1 * n2;
                break;
            case "/":
                ope = n1 / n2;
                break;
            default:
                System.out.println("Operação inválida");
        }
        
        auxI = Math.ceil(ope);
        
        System.out.printf("Resultado: %.2f%n", ope);
        System.out.println((ope % 2 == 0) ? "Par" : "Ímpar");
        System.out.println((ope < 0) ? "Negativo" : "Positivo");
        System.out.println((ope == auxI) ? "Inteiro" : "Real");
    }
}
