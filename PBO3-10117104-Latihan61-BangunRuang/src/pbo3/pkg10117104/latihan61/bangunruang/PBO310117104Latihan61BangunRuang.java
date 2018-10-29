/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117104.latihan61.bangunruang;

/**
 *
 * @author 
 * Nama : Aditya Suheryana
 * Kelas IF-3/PBO3
 * Nim : 10117104
 * Deskripsi Program : menghasilkan dan menampilkan Volume 3 bangun Ruang
 */
public class PBO310117104Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               Bola obj2 = new Bola();
        obj2.setJari2(7);
        System.out.println("Jari-jari dari sebuah bola basket adalah "+obj2.getJari2()+
                " cm");
        System.out.println("Maka Volumenya adalah "+obj2.volumeBola());
        
        System.out.println(""); 
        
        Tabung obj = new Tabung();
        obj.setJari2(10);
        obj.setTinggi(21);
        System.out.println("Sebuah Tabung Memiliki Jari - jari berukuran "+obj.getJari2()+
                " cm dan Tingginya "+obj.getTinggi()+" cm");
        System.out.println("Maka Volumenya adalah "+obj.volumeTabung());
        
        System.out.println("");
    
        
        Kerucut obj1 = new Kerucut();
        obj.setJari2(14);
        obj.setTinggi(9);
        System.out.println("Diketahui tinggi sebuah kerucut "+obj.getTinggi()+
                " cm dan jari-jarinya "+obj.getJari2()+" cm");
        System.out.println("Maka Volumenya adalah "+obj.volumeKerucut());
        
        System.out.println("");
       
        

       
    }
    
    
}
