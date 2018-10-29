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
public abstract class BangunRuang {
    
protected final double phi = 3.14;
    protected int jari2,tinggi;

    public int getJari2() {
        return jari2;
    }

    public void setJari2(int jari2) {
        this.jari2 = jari2;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
    public abstract double volumeBola();
    public abstract double volumeTabung();
    public abstract double volumeKerucut();
    

}