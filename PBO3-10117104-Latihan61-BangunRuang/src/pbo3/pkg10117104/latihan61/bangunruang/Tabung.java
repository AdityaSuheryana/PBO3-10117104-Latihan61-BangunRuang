/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117104.latihan61.bangunruang;

/**
 *
 * @author user
 */
public class Tabung extends BangunRuang {

    @Override
    public double volumeTabung() {
       return phi * jari2 * jari2 * tinggi;
    }

    @Override
    public double volumeKerucut() {
        return 0.3333333333 * phi * jari2 * jari2 * tinggi;
    }

    @Override
    public double volumeBola() {
        return 0.6666666667 * phi * jari2 * jari2;
    }
    
}    
