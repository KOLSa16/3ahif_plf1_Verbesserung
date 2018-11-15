/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import java.io.Serializable;

/**
 *
 * @author sasch
 */
public class Fahrt implements Serializable{
    public static final long serialVersionUID = 42L;
    private int km;
    private double liter,verbrauch;
    private String Kennzeichen;

    public Fahrt(int km, double liter,String Kennzeichen) {
        this.km = km;
        this.liter = liter;
        this.Kennzeichen = Kennzeichen;
        this.verbrauch=calcVerbrauch(km, liter);
    }

    public int getKm() {
        return km;
    }

    public double getLiter() {
        return liter;
    }

    public String getKennzeichen() {
        return Kennzeichen;
    }

    public double getVerbrauch() {
        return verbrauch;
    }

    public void setKennzeichen(String Kennzeichen) {
        this.Kennzeichen = Kennzeichen;
    }
    
    public static double calcVerbrauch(int km,double liter){
        return liter/km*100;
    }

    @Override
    public String toString() {
        return "Fahrt{" + "km=" + km + ", liter=" + liter + ", verbrauch=" + verbrauch + ", Kennzeichen=" + Kennzeichen + '}';
    }
    
    public static void main(String[] args) {
        System.out.println(calcVerbrauch(161, 5.1));
    }
    
}
