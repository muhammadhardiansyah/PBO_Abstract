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
public abstract class BangunRuang {
    public double jari,tinggi,panjang,lebar;
    BangunRuang(double jari, double tinggi){
        this.jari = jari;
        this.tinggi = tinggi;
    }
    BangunRuang(double panjang, double lebar, double tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    BangunRuang(double jari){
        this.jari = jari;
    }
    
    public abstract double hitungVolume();
    public abstract double hitungLuasPerm();
    
    public void tampilhasil(){
        System.out.println("Volumenya adalah        : " + this.hitungVolume());
        System.out.println("Luas permukaannya adalah: " + this.hitungLuasPerm());
        System.out.println("");
    }
}
