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
public class PersegiPanjang extends BangunDatar{
    public double panjang;
    public double lebar;
    
    public double hitungLuas(){
        return this.panjang * this.lebar;
    }
    public double hitungKeliling(){
        return (2. * this.panjang) + (2. * this.lebar);
    }
}
