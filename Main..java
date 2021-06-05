/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toko;

/**
 *
 * @author andk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Toko objek = new Toko ();
    objek.Display();
    objek.setAdmin("Andika Dewa");
    System.out.println("Admin: "+objek.getAdmin()+"      11/06/2021");
        System.out.println("=========================================");
        
    // pemanggilan class SmartPhone
        // inisialisasi objek pada class SmarPhone
        SmartPhone hp = new SmartPhone();
        // memanggil method Display pada class SmartPhone
        hp.Display();
        // memanggil method setMerk pada class SmartPhone
        hp.setMerk(" nokia ");
        // memanggil method getMerk pada class SmartPhone
        System.out.println("Merk                    : "+hp.getMerk());
        // memanggil method setjmlKamera pada class SmartPhone
        hp.setjmlKamera(2);
        // memanggil method getjmlKamera pada class SmartPhone
        System.out.println("Jumlah Kamera Belakang  : "+hp.getjmlKamera());
        // memanggil method setTotal pada class SmartPhone
        hp.setTotal(1);
        // memanggil method getTotal pada class SmartPhone
        System.out.println("Total Barang            : "+hp.getTotal());
        // memanggil method setHarga pada class SmartPhone
        hp.setHarga(12000000);
        // memanggil method getHarga pada class SmartPhone
        System.out.println("Harga                   : Rp "+hp.getHarga());
        
        // pemanggilan class TV
        // inisialisasi objek pada class TV
        TV barang = new TV();
        // memanggil method Display pada class TV
        barang.Display();
        // memanggil method setMerk pada class TV
        barang.setMerk("LG");
        // memanggil method getMerk pada class TV
        System.out.println("Merk                    : "+barang.getMerk());
        // memanggil method setJenis pada class TV
        barang.setJenis("LED LG 32LF520A  ");
        // memanggil method getJenis pada class TV
        System.out.println("Jenis                   : "+barang.getJenis());
        // memanggil method setTotal pada class TV
        barang.setTotal(1);
        // memanggil method getTotal pada class TV
        System.out.println("Total Barang            : "+barang.getTotal());
        // memanggil method setHarga pada class TV
        barang.setHarga(15000000);
        // memanggil method getHarga pada class TV
        System.out.println("Harga                   : Rp "+barang.getHarga());
        
        // pemanggilan class KipasAngin
        // inisialisasi objek pada class KipasAngin
        KipasAngin produk = new KipasAngin();
        // memanggil method Display pada class KipasAngin
        produk.Display();
        // memanggil method setMerk pada class KipasAngin
        produk.setMerk("Samsung");
        // memanggil method getMerk pada class KipasAngin
        System.out.println("Merk                    : "+produk.getMerk());
        // memanggil method setUkuran pada class KipasAngin
        produk.setUkuran(16);
        // memanggil method getUkuran pada class KipasAngin
        System.out.println("Ukuran Diameter Kipas   : "+produk.getUkuran()+"cm");
        // memanggil method setTotal pada class KipasAngin
        produk.setTotal(1);
        // memanggil method getTotal pada class KipasAngin
        System.out.println("Total Barang            : "+produk.getTotal());
        // memanggil method setHarga pada class KipasAngin
        produk.setHarga(500000);
        // memanggil method getHarga pada class KipasAngin
        System.out.println("Harga                   : Rp "+produk.getHarga());
        
        //penutup
        System.out.println("\n================================================");
        System.out.println("          TERIMAKASIH TELAH BERBELANJA            ");
        System.out.println("================================================");
    }
        
    }
    
    

