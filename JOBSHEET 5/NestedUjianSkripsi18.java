//PERCOBAAN 3
// MUHAMMAD SAUM SAIFULLOH /1E/18/SISTEM INFORMASI BISNIS

import java.util.Scanner;  

public class NestedUjianSkripsi18 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Apakah mahasiswa sudah bebas kompen? (ya/tidak): ");
        String bebasKompen = input.next().trim();
        System.out.print("Masukan jumlah log bimbingan pembimbing 1: ");
        int logBimbingan1 = input.nextInt();
        System.out.print("Masukan jumlah log bimbingan pembimbing 2: ");
        int logBimbingan2 = input.nextInt();
        String pesan = "";

        if (bebasKompen.equalsIgnoreCase("ya")) {
            if (logBimbingan1 >= 8 && logBimbingan2 >= 4) {
                 pesan = "semua syarat terpenuhi, mahasiswa boleh mendaftar ujian skripsi.";
            } else if (logBimbingan1 < 8 && logBimbingan2 >= 4) {
                 pesan = "Gagal! Log bimbinganP1 kurang dari 8 kali dan P2 kurang dari 4 kali.";
            } else if (logBimbingan1 < 8) {
                 pesan = "Gagal! Log bimbingan P1 kurang dari 8 kali.";
            } else {
                 pesan = "Gagal! Log bimbingan P2 kurang dari 4 kali.";
            }
            } else {
             pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen.";
             }
             System.out.println(pesan); 

            input.close();
         }
    }


        
