/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

/**
 *
 * @author sasch
 */
public enum FahrtenSpaltenName {
    KM("Km"),
    LITER("Liter"),
    KENNZEICHEN("Kennzeichen"),
    VERBRAUCH100KM("Verbrauch 100 Km");
    String name;
    public String getName(){
        return name;
    }

    private FahrtenSpaltenName(String name) {
        this.name = name;
    }
    
}
