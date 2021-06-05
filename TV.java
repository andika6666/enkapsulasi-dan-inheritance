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
public class TV extends Toko{
    String jenis; 
    
    //menerapkan method setHarga
    public void setHarga(int harga){
        super.harga = harga;
    }
    //menerapkan method getHarga
    public int getHarga(){
        return harga;
    }
    //menerapkan method setTotal
    public void setTotal(int total){
        super.total = total;
    }
    //menerapkan method getTotal
    public int getTotal(){
        return total;
    }
    //menerapkan method setMerk
    public void setMerk(String merk){
        super.merk = merk;
    }
    //menerapkan method getMerk
    public String getMerk(){
        return merk;
    }
    //menerapkan method setjmlKamera
    public void setJenis(String jenis){
        this.jenis = jenis;
    }
    //menerapkan method getjmlKamera
    public String getJenis(){
        return jenis;
    }
    //menerapkan method Display
    public void Display(){
        System.out.println("\n----------Pembelian TV-----------");    
    }
}
