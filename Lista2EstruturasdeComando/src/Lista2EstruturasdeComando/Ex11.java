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
public class Ex11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Informe em que turno você estuda (M/V/N): ");
        String p = in.nextLine();
        
        switch (p) {
            case "m":
            case "M":
                System.out.println("Bom Dia!");
                break;
            case "v":
            case "V":
                System.out.println("Boa Tarde!");
                break;
            case "n":
            case "N":
                System.out.println("Boa Noite!");
                break;
            default:
                System.out.println("Período Inexistente!");
        }
    }
}
