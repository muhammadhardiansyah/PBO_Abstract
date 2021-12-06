/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobil;

/**
 *
 * @author asus
 */
public abstract class estimasi {
    public double jarak, rerataKec;
    protected abstract double konsumsiBbm(); //setiap satu 1 liter
    
    protected double hitungBbm(){
        return this.jarak / this.konsumsiBbm();
    }
    protected double hitungWaktuPerjalanan(){
        return this.jarak / this.rerataKec;
    }
    public void tampilHasil(){
        System.out.println("Bahan bakar minimal yang dibutuhkan adalah      : "+this.hitungBbm() + " Liter");
        System.out.println("Waktu perjalanan untuk sampai ke tujuan adalah  : "+this.hitungWaktuPerjalanan() + " jam");
    }
    
}
