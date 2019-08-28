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

class QuadradoTeste {
    public static void main(String[] args) {
        Quadrado q = new Quadrado();
        q.setLado(10);
        System.out.println(q.getLado());
        System.out.println(q.area());
    }
}

public class Quadrado {
    private double lado;

    public double area() {
        return lado * lado;
    }
    
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if (lado > 0)
            this.lado = lado;
    }
}
