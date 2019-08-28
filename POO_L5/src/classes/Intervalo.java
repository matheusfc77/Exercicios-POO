/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author roberta.beltran
 */

class TesteIntervalo {
    public static void main(String[] args) {
        Intervalo itv = new Intervalo();
        itv.setInicio(4);
        itv.setFim(10);
        String[] interv = itv.intervalo();
        
        if (interv[interv.length-1].length() > 0)
            System.out.println(interv[interv.length-1]);
        
        System.out.printf("Números entre %d e %d: ", itv.getInicio(), itv.getFim());
        for (int i = 0; i < interv.length - 1; i++)
            System.out.printf("%s ", interv[i]);
        System.out.println();
    }
}

public class Intervalo {
    private int inicio;
    private int fim;

    public String[] intervalo() {
        String aviso = "";
        if (fim < inicio) {
            aviso = "Início menor que o fim. Inversão dos números realizada.";
            int aux = fim;
            fim = inicio;
            inicio = aux;
        }
        String[] intervalo = new String[fim - inicio];
        int aux = inicio;
        for (int i = 0; i < fim - inicio - 1; i++)
            intervalo[i] = Integer.toString(++aux); 
        intervalo[fim - inicio - 1] = aviso;
        return intervalo;
    }
    
    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getFim() {
        return fim;
    }

    public void setFim(int fim) {
        this.fim = fim;
    }
}
