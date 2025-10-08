//PERCOBAAN 1
// MUHAMMAD SAUM SAIFULLOH /1E/18/SISTEM INFORMASI BISNIS

import java.util.Scanner;

public class ifCetakKRS18{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (ya/tidak): ");
        boolean uktLunas = input.nextBoolean();

        if (uktLunas) {
            System.out.print("Pembayaran UKT terverifikasi?");
            System.out.print("Silakan cetak KRS dan minta tanda tangan DPA");

            input.close();
            
    }
}
}