/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectperjalananmobil;

/**
 *
 * @author asus
 */
import mobil.*;
public class ProjectPerjalananMobil {

    public static void main(String[] args) {
        
        Sedan A = new Sedan();
        A.jarak = 109;
        A.rerataKec = 60;
        System.out.println("A | Sedan | Solo-Kudus ("+ A.jarak +" km) | "+ A.rerataKec +" km/jam");
        A.tampilHasil();
        System.out.println("-------------------------------------------");
       
        Sedan B = new Sedan();
        B.jarak = 534;
        B.rerataKec = 65;
        System.out.println("B | Sedan | Solo-Jakarta ("+ B.jarak +" km) | "+ B.rerataKec +" km/jam");
        B.tampilHasil();
        System.out.println("-------------------------------------------");
        
        SUV C = new SUV();
        C.jarak = 659;
        C.rerataKec = 57;
        System.out.println("C |  SUV  | Solo-Banten ("+ C.jarak +" km) | "+ C.rerataKec +" km/jam");
        C.tampilHasil();
        System.out.println("-------------------------------------------");
        
        SUV D = new SUV();
        D.jarak = 466;
        D.rerataKec = 62;
        System.out.println("D |  SUV  | Solo-Bandung ("+D.jarak+" km) | "+D.rerataKec+" km/jam");
        D.tampilHasil();
        System.out.println("-------------------------------------------");
        
        MPV E = new MPV();
        E.jarak = 541;
        E.rerataKec = 64;
        System.out.println("E |  MPV  | Solo-Banyuwangi ("+ E.jarak +" km) | "+ E.rerataKec +" km/jam");
        E.tampilHasil();
        System.out.println("-------------------------------------------");
        
        MPV F = new MPV();
        F.jarak = 427;
        F.rerataKec = 53;
        System.out.println("F |  MPV  | Solo-Jember ("+ F.jarak +" km) | "+ F.rerataKec +" km");
        F.tampilHasil();
        System.out.println("-------------------------------------------");
    }
    
}
