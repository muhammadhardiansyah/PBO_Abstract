/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;

/**
 *
 * @author asus
 */
import bangundatar.*;
import bangunruang.*;
public class MainClass {
    public static void main(String[] args) {
        Persegi p1 = new Persegi();
        System.out.println("---Persegi---");
        p1.sisi = 5;
        System.out.println("Sisi: " + p1.sisi);
        p1.tampilHasil();
        
        PersegiPanjang pp = new PersegiPanjang();
        System.out.println("---Persegi Panjang---");
        pp.panjang = 5;
        pp.lebar = 4;
        System.out.println("Panjang: "+pp.panjang+" dan lebar: "+pp.lebar);
        pp.tampilHasil();
        
        Lingkaran L = new Lingkaran();
        System.out.println("---Lingkaran---");
        L.jari = 10;
        System.out.println("Jari-jari: "+L.jari);
        L.tampilHasil();
        
        Tabung tb = new Tabung(10, 8);
        System.out.println("---Tabung---");
        System.out.println("jari-jari:"+tb.jari+" dan tinggi: "+tb.tinggi);
        tb.tampilhasil();
        
        Balok bl = new Balok(10,8,6);
        System.out.println("---Balok---");
        System.out.println("Panjang: "+bl.panjang+", lebar: "+bl.lebar+", dan tinggi: "+bl.tinggi);
        bl.tampilhasil();
        
        Bola bola = new Bola(10);
        System.out.println("---Bola---");
        System.out.println("Jari-jari: "+bola.jari);
        bola.tampilhasil();
    }
}
