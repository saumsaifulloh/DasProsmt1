// kode genap 
// 18_Muhammad Saum Sifulloh

import java.util.Scanner;

public class cicilankoperasi18 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int jangkaWaktuPinjaman;
        int biayaAdmin;
        double jumlahUangYangDiterima;
        double cicilanPerBulan;
        
        System.out.print("waktu pinjaman: ");
        jangkaWaktuPinjaman = input.nextInt();

        System.out.print("biaya admin: ");
        biayaAdmin = input.nextInt();

        jumlahUangYangDiterima = 10000000 - biayaAdmin;
        System.out.println("jumlah uang yang diterima = " + jumlahUangYangDiterima);

        input.close();
    }
}