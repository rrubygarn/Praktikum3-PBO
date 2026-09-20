/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum3;

/**
 *
 * @author Inka Putri
 */
public class MainBank {
    public static void main(String[] args) {
        Rekening akunNasabah = new Rekening("1234567890", "Inka Putri", 1000000.0);

        System.out.println("=== SISTEM TRANSAKSI BANK ===");
        System.out.println("Nomor Rekening (Masked): " + akunNasabah.maskingNomorRekening());
        System.out.println();
        
        try {
            
            System.out.println("Melakukan penarikan pertama (Rp 300.000)...");
            akunNasabah.tarikTunai(300000.0);
            
            System.out.println("----------------------------------------");
            System.out.println("Melakukan penarikan kedua (Rp 900.000)...");
            akunNasabah.tarikTunai(900000.0); 

        } catch (SaldoTidakMencukupiException e) {
            System.out.println("\n[PERINGATAN] Terjadi Kesalahan Transaksi:");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("----------------------------------------");
            System.out.println("Transaksi selesai diproses.");
            System.out.println("Nomor Rekening Terkait: " + akunNasabah.maskingNomorRekening());
            System.out.println("========================================");
        }
    }
}

