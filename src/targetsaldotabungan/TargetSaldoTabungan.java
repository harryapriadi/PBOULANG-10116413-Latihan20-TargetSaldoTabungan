/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package targetsaldotabungan;

import java.text.DecimalFormat;

/**
 *
 * @author Lenovo
 * NAMA         : HARRY APRIADI
 * KELAS        : PBONGULANG
 * NIM          : 10116413
 * DESKRIPSI    : program untuk menghitung target saldo tabungan
 */
public class TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String format="###,###.#";
     DecimalFormat dm = new DecimalFormat(format);
        int i = 1;
        int saldoAwal = 3500000;
        double bunga = 0.08;
        int saldoBulanan;
        
        do{
            saldoBulanan = (int) (bunga * saldoAwal);
            saldoAwal = (saldoAwal + saldoBulanan);
            System.out.println("Saldo di bulan ke- "+ i + " Rp " +(dm.format(saldoAwal)));
            i++;
        } while (i<=8);
    }
}