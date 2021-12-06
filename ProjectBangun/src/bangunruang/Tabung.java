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
public class Tabung extends BangunRuang{

    public Tabung(double jari, double tinggi) {
        super(jari, tinggi);
    }
    
    public double hitungVolume(){
        return Math.PI * this.jari * this.jari * this.tinggi;
    }
    public double hitungLuasPerm(){
        return 2. * Math.PI * this.jari * (this.jari + this.tinggi);
    }
}
