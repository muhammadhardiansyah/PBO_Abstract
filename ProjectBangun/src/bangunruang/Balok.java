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
public class Balok extends BangunRuang{
    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar, tinggi);
    }

    public double hitungVolume(){
        return this.panjang * this.lebar * this.tinggi;
    }
    public double hitungLuasPerm(){
        return 2. * ((this.panjang * this.lebar)+(this.panjang*this.tinggi)+(this.lebar*this.tinggi));
    }
}
