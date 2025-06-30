/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Project_UAS;

/**
 *
 * @author Alfarizi Bima Setyawan
 * Kelas Pemrogaman Berorientasi Objek - 2B
 * Alfarizi311215@gmail.com
 */
public class Product extends ProductDasar{

     
    protected int harga;
    protected int stock;

    public Product(int kode, String nama, int harga, int stock) {
        super(kode, nama);
        this.harga = harga;
        this.stock = stock;
    }

    // Getter
    public int getHarga() {
        return harga;
    }

    public int getStock() {
        return stock;
    }

//    // Setter
//    public void setHarga(int harga) {
//        this.harga = harga;
//    }
//
//    public void setStock(int stock) {
//        this.stock = stock;
//    }

    // Override
    @Override
    public String getInfoProduk() {
        return super.getInfoProduk() + ", Harga: " + harga + ", Stok: " + stock;
    }
}

