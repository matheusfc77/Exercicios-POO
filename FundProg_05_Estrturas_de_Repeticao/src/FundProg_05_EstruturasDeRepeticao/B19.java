/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FundProg_05_EstruturasDeRepeticao;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author mathe
 */
public class B19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int divisor;
        int quociente;
        int resto;
        int divisoes;
        ArrayList<Integer> primos = new ArrayList();
        ArrayList<Integer> numDiv = new ArrayList();
        
        System.out.print("Informe um número inteiro positivo: ");
        int n = in.nextInt();
        
        for (int i = 2; i < n; i++) {
            divisoes = 1;

            if (i == 2) {
                primos.add(i);
                numDiv.add(divisoes);
            } else {
                quociente = n;
                divisor = 1;
                while (quociente >= divisor) {
                    divisor = primos.get(divisoes-1);
                    quociente = i / divisor;
                    resto = i % divisor;

                    if (quociente < divisor && resto != 0 && !primos.contains(i)) {
                        primos.add(i);
                        numDiv.add(divisoes);
                        break;
                    } else if (resto == 0)
                        break;

                    divisoes++;
                }
            }
        }
        
        System.out.printf("%nNúmeros primos no intervalo de 1 a %d%nNº Primo   Qnt de divisões%n", n);
        for (int i = 0; i < primos.size(); i++) {
            System.out.printf("%d\t\t%d%n", primos.get(i), numDiv.get(i));
        }
        
        in.close();
    }
}
