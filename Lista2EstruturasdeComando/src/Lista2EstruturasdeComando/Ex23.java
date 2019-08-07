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
public class Ex23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double m;
        
        System.out.print("Informe a idade do aluno 1: ");
        int n1 = in.nextInt();
        System.out.print("Informe a idade do aluno 2: ");
        int n2 = in.nextInt();
        System.out.print("Informe a idade do aluno 3: ");
        int n3 = in.nextInt();
        
        m = (n1+n2+n3) / 3;
        
        if (m < 25)
            System.out.println("Turma jovem");
        else if (m < 40)
            System.out.println("Turma Adulta");
        else 
            System.out.println("Turma Idosa");
    }
}
