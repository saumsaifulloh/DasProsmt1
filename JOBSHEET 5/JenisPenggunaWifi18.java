//SOAL 3.JenisPenggunaWifi18.java
//MUHAMMAD SAUM SAIFULLOH /1E/18/SISTEM INFORMASI BISNIS

import java.util.Scanner;

public class JenisPenggunaWifi18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("JenisPengguna (dosen/mahasiswa): ");
        String jenisPengguna = input.next().toLowerCase();
        String pesan = "";

        if (jenisPengguna.equalsIgnoreCase("Dosen")) {
            System.out.println("Akses diberikan dosen.");
            } else if (jenisPengguna.equalsIgnoreCase("Mahasiswa")) {
            System.out.println("Apakah ingin input jumlah SKS? (ya/tidak): ");
            String pilihan = input.next().toLowerCase();

            if (pilihan.equals("ya")) {
            System.out.print("Masukkan jumlah SKS: ");
             int sks = input.nextInt();
            
            if (sks >=12) {
                 System.out.println("Akses diberikan mahasiswa");
            } else {
                 System.out.println("Akses ditolak, jumlah SKS kurang dari 12.");
            }
            } else {
                 System.out.println("Input SKS tidak dilakukan, selesai.");
            }
            } else {
             System.out.println("Jenis Pengguna tidak valid.");

            input.close();
         }    
    }
}
