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
public class Salario {
    private double valHora;
    private int numHoras;

    private double[] descontos(double slrBruto) {
        double[] desc = new double[3];
        desc[0] = slrBruto * 0.11;
        desc[1] = slrBruto * 0.08;
        desc[2] = slrBruto * 0.05;
        return desc;
    }
    
    public double[] calcSlr() {
        double slr = valHora * numHoras;
        double[] desc = descontos(slr);
        double ttDesc = 0;
        for (double i: desc)
            ttDesc += i;
        double slrLimpo = slr - ttDesc;
        double[] infSlr = new double[5];
        infSlr[0] = slr;
        infSlr[1] = slrLimpo;
        for (int i = 2; i < infSlr.length; i++)
            infSlr[i] = desc[i-2];
        return infSlr;
    }
    
    public double getValHora() {
        return valHora;
    }

    public void setValHora(double valHora) {
        if (valHora >= 0)
            this.valHora = valHora;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        if (numHoras >= 0)
            this.numHoras = numHoras;
    }
}
