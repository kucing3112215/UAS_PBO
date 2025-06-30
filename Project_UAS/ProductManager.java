/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Project_UAS;

import javax.swing.*;

/**
 *
 * @author Muhamad Fajar
 * Kelas Pemrograman Berorientasi Objek - 2B
 * email : fajarmhmd2121@gmail.com
 */
public class ProductManager extends JFrame {
    

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new ProductForm().setVisible(true);
        });
    }
}