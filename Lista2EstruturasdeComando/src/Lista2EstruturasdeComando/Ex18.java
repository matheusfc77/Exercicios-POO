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
public class Ex18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Informe o lado a: ");
        int a = in.nextInt();
        System.out.print("Informe o lado b: ");
        int b = in.nextInt();
        System.out.print("Informe o lado c: ");
        int c = in.nextInt();
        
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            System.out.println("Os três lados formam um triângulo");
            if (a == b && b == c) {
                System.out.println("Triângulo equilátero");
            } else if (a == b || a == c || b == c) {
                System.out.println("Triângulo isóceles");
            } else {
                System.out.println("Triângulo escaleno");
            }
        } else
            System.out.println("Os lados informados não formam um triângulo");
    }
}
