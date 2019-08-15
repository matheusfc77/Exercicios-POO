/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FundProg_05_EstruturasDeRepeticao;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class A2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        boolean verif = true;
        while (verif) {
            System.out.print("Usuário: ");
            String usu = in.nextLine();
            System.out.print("Senha: ");
            String senha = in.nextLine();
            
            if (usu.equals(senha))
                System.out.println("Informações inválidas. Informe os dados novamente");
            else 
                verif = false;
        }
    }
}
