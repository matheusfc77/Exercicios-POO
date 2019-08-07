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
public class Ex15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String origem;
        
        System.out.print("Informe o preço: ");
        double p = Double.parseDouble(in.nextLine());
        System.out.print("Informe o código de origem: ");
        int c = in.nextInt();
        
        switch (c) {
            case 1:
                origem = "Sul";
                break;
            case 2:
                origem = "Norte";
                break;
            case 3:
                origem = "Leste";
                break;
            case 4: 
                origem = "Oeste";
                break;
            case 5:
            case 6:
                origem = "Nordeste";
                break;
            case 7:
            case 8:
                origem = "Centro-Oeste";
                break;
            default:
                origem = "Importado";
        }
        
        System.out.printf("Preço: R$ %.2f%n", p);
        System.out.println("Procedência: " + origem);
    }
}
