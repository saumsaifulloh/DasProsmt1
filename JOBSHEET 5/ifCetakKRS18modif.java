//SOAL 1.ifCetakKRS18modif.java
//MUHAMMAD SAUM SAIFULLOH /1E/18/SISTEM INFORMASI BISNIS

import java.util.Scanner;

    public class ifCetakKRS18modif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (ya/tidak): ");
        boolean uktLunas = input.nextBoolean();

        String Hasil = uktLunas ? "Pembayaran UKT terverifikasi? Silakan cetak KRS dan minta tanda tangan DPA" : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu.";
        System.out.println(Hasil);

        
    }
    }
