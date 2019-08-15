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
public class D30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int codigo;
        double alt;
        double peso;
        double altMax = 0;
        double altMin = 10;
        double pesoMin = 1000;
        double pesoMax = 0;
        int count = 0;
        double pesoTotal = 0;
        double altTotal = 0;
        
        double auxPesMinAlt = 0;
        double auxPesMaxAlt = 0;
        double auxAltMinPeso = 0;
        double auxAltMaxPeso = 0;
        int auxCodAltMin = 0;
        int auxCodAltMax = 0;
        int auxCodPesoMin = 0;
        int auxCodPesoMax = 0;
        
        
        System.out.println("Digite 0 no campo \"Código\" para finalizar as informações");
        System.out.printf("Cliente %d%n\tCódigo: ", count+1);
        codigo = Integer.parseInt(in.nextLine());
        System.out.print("\tAltura (m): ");
        alt = Double.parseDouble(in.nextLine());
        System.out.print("\tPeso (kg): ");
        peso = Double.parseDouble(in.nextLine());
       
        
        do {
            if (altMin > alt) {
                altMin = alt;
                auxAltMinPeso = peso;
                auxCodAltMin = codigo;
            } else if (altMax < alt) {
                altMax = alt;
                auxAltMaxPeso = peso;
                auxCodAltMax = codigo;
            }
            
            if (pesoMin > peso) {
                pesoMin = peso;
                auxPesMinAlt = alt;
                auxCodPesoMin = codigo;
            } else if (pesoMax < peso) {
                pesoMax = peso;
                auxPesMaxAlt = alt;
                auxCodPesoMax = codigo;
            }
            
            pesoTotal += peso;
            altTotal += alt;
            count++;
            
            System.out.printf("Cliente %d%n\tCódigo: ", count+1);
            codigo = Integer.parseInt(in.nextLine());
            if (codigo == 0)
                break;
            System.out.print("\tAltura (m): ");
            alt = Double.parseDouble(in.nextLine());
            System.out.print("\tPeso (kg): ");
            peso = Double.parseDouble(in.nextLine());
            
        } while (true);
        
        System.out.printf("%nCliente mais baixo:%n\tCódigo: %d%n\tAltura: %.2f m%n\tPeso: %.2f kg%n", auxCodAltMin, altMin, auxAltMinPeso);
        System.out.printf("%nCliente mais alto:%n\tCódigo: %d%n\tAltura: %.2f m%n\tPeso: %.2f kg%n", auxCodAltMax, altMax, auxAltMaxPeso);
        System.out.printf("%nCliente mais magro:%n\tCódigo: %d%n\tAltura: %.2f m%n\tPeso: %.2f kg%n", auxCodPesoMin, auxPesMinAlt, pesoMin);
        System.out.printf("%nCliente mais pesado:%n\tCódigo: %d%n\tAltura: %.2f m%n\tPeso: %.2f kg%n", auxCodPesoMax, auxPesMaxAlt, pesoMax);
        System.out.printf("%nMédia das alturas: %.2f m", altTotal/count);
        System.out.printf("%nMédia dos pesos: %.2f kg%n", pesoTotal/count);
        
        in.close();
    }
}
