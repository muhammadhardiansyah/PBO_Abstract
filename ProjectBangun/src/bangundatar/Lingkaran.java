/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author asus
 */
public class Lingkaran extends BangunDatar{
    public double jari;
    
    public double hitungLuas(){
        return Math.PI * this.jari * this.jari;
    }
    public double hitungKeliling(){
        return Math.PI * 2. * this.jari;
    }
}
