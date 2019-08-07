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
public class Ex21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Informe uma data (dd/mm/aaaa): ");
        String[] data = in.nextLine().split("/");
        
        int[] dt = new int[3];
        for (int i = 0; i < data.length; i++)
            dt[i] = Integer.parseInt(data[i]);
        
        if (dt[2] > 0 && dt[1] > 0 && dt[1] < 13 && dt[0] > 0) {
            if (dt[1] == 2 && dt[0] <= 29)
                System.out.println("Data válida");
            else if (dt[1] % 2 == 1 && dt[0] < 32) 
                System.out.println("Data válida");
            else if (dt[1] != 2 && dt[0] < 31)
                System.out.println("Data válida");
            else
                System.out.println("Data inválida");
        }
        
        
    }
}
