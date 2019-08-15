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
public class A3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        boolean verif = true;
        
        while (verif) {
            System.out.print("Nome: ");
            String nome = in.nextLine();
            System.out.print("Idade: ");
            int idade = Integer.parseInt(in.nextLine());
            System.out.print("Salário: ");
            double salario = Double.parseDouble(in.nextLine());
            System.out.print("Sexo (f/m): ");
            String sexo = in.nextLine();
            System.out.print("Estado Civil: ");
            String estCivil = in.nextLine();


            if (nome.length() < 4)
                System.out.println("Nome inválido");
            else if (!(idade >= 0 && idade <= 150))
                System.out.println("Idade inválida");
            else if (salario <= 0)
                System.out.println("Salário inválido");
            else if (!("f".equalsIgnoreCase(sexo) || "m".equalsIgnoreCase(sexo)))
                System.out.println("Sexo inválido");
            else if (!("s".equalsIgnoreCase(estCivil) || "c".equalsIgnoreCase(estCivil) || "v".equalsIgnoreCase(estCivil) || "d".equalsIgnoreCase(estCivil)))
                System.out.println("Estado civil inválido");
            else {
                verif = false;
                System.out.println("Entradas válidas");
            }
        
        }
            
    }
}
