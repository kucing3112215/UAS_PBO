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
public class ProductDasar {
    protected int kode;
    protected String nama;

    public ProductDasar(int kode, String nama) {
        this.kode = kode;
        this.nama = nama;
    }

    public int getKode() {
        return kode;
    }

//    public void setKode(int kode) {
//        this.kode = kode;
//    }

    public String getNama() {
        return nama;
    }

//    public void setNama(String nama) {
//        this.nama = nama;
//    }

    public String getInfoProduk() {
        return "Kode: " + kode + ", Nama: " + nama;
    }
}

   
//    private int kode;
//    private String nama;
//    private int harga;
//    private int stock;
//
//    // Constructor
//    public Product(int kode, String nama, int harga, int stock) {
//        this.kode = kode;
//        this.nama = nama;
//        this.harga = harga;
//        this.stock = stock;
//    }
//
//    // Getter
//    public int getKode() {
//        return kode;
//    }
//
//    public String getNama() {
//        return nama;
//    }
//
//    public int getHarga() {
//        return harga;
//    }
//
//    public int getStock() {
//        return stock;
//    }
//
//    // Setter
//    public void setKode(int kode) {
//        this.kode = kode;
//    }
//
//    public void setNama(String nama) {
//        this.nama = nama;
//    }
//
//    public void setHarga(int harga) {
//        this.harga = harga;
//    }
//
//    public void setStock(int stock) {
//        this.stock = stock;
//    }
//}
