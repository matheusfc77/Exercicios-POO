/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class B11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] data = new int[3];
        
        System.out.print("Informe uma data (dd/mm/aaaa): ");
        String[] d = in.nextLine().split("/");
        
        for (int i = 0; i < data.length; i++)
            data[i] = Integer.parseInt(d[i]);
        
        boolean valida = false;
        switch (data[1]) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (data[0] < 32 && data[0] > -1)
                    valida = true;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (data[0] < 31 && data[0] > -1)
                    valida = true;
                break;
            case 2:
                boolean anoB = (data[2] % 4 == 0 && (data[2] % 100 != 0));
                if (anoB && data[0] < 30 && data[0] > -1)
                    valida = true;
                else if (!anoB && data[0] < 29 && data[0] > -1)
                    valida = true;
        }
        if (valida == true) 
            System.out.println("Data Válida");
        else 
            System.out.println("Data inválida");
        
        in.close();
    }
}
