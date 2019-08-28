/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author matheus
 */
public class Salario02 {
    private double valHora;
    private int numHoras;
    
    public double slrBruto() {
        return valHora * numHoras;
    }
    
    public double impRenda(double slr) {
        return slr * 0.11;
    }
    
    public double inss(double slr) {
        return slr * 0.08;
    }
    
    public double sindicato(double slr) {
        return slr * 0.05;
    }
    
    public double ttDesc() {
        return impRenda(slrBruto()) + inss(slrBruto()) + sindicato(slrBruto());
    }
    
    public double slrLiq() {
        return slrBruto() - ttDesc();
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
