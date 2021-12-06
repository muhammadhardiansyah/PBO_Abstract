/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author asus
 */
public class Bola extends BangunRuang{
    public Bola(double jari) {
        super(jari);
    }
    
    public double hitungVolume(){
        return (4./3.) * Math.PI * this.jari * this.jari * this.jari;
    }
    public double hitungLuasPerm(){
        return 4. * Math.PI * this.jari * this.jari;
    }
}
