/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum3;

/**
 *
 * @author Inka Putri
 */
public class Rekening {
        private String nomorRekening;
        private String namaNasabah;
        private double Saldo;
        
        public Rekening(String nomorRekening, String namaNasabah, double Saldo) {
            this.nomorRekening = nomorRekening;
            this.namaNasabah = namaNasabah;
            this.Saldo = Saldo;
        }
        
        public void tarikTunai(double jumlah) throws SaldoTidakMencukupiException {
            if (jumlah > Saldo){
             
                throw new SaldoTidakMencukupiException("Penarikan gagal! Jumlah Rp " + jumlah + " melebihi sisa saldo Anda (Rp " + Saldo + ").");
            }else{
                Saldo -= jumlah;
                System.out.println("Penarikan tunai sebesar Rp " + jumlah + " berhasil.");
                System.out.println("Sisa saldo saat ini: Rp " + Saldo);
            }
        }
        
        public String maskingNomorRekening(){
            StringBuilder sb = new StringBuilder(nomorRekening);
            
            if (sb.length() > 5){
                for (int i= 5; i < sb.length(); i++){
                    sb.setCharAt(i, '*');
                }
            }
            return sb.toString();
        }
    }
