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

class TelevisorTeste {
    public static void main(String[] args) {
        Televisor t = new Televisor();
        t.setCanal(2);
        t.setVolume(20);
        t.setCanal(1003);
        t.setVolume(-2);
        t.aumentaVolume();
        System.out.println(t.toString());
    }
}

public class Televisor {
    private int canal;
    private int volume;

    public void aumentaVolume() {
        this.volume++;
    }
    
    public void dminuiVolume() {
        this.volume--;
    }
    
    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if (canal > 0 && canal < 1000)
            this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100)
            this.volume = volume;
    }

    @Override
    public String toString() {
        return "Televisor{" + "canal=" + canal + ", volume=" + volume + '}';
    }
}
