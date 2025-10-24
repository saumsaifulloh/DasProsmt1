import java.util.Scanner;

public class PenjualanTiket17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hargaTiket = 50000;
        int jumlahTiket;
        int totalTiket = 0;
        double totalPendapatan = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (0 untuk selesai): ");
            jumlahTiket = input.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak boleh negatif! Silakan inputkan ulang.");
                continue;
            }
            if (jumlahTiket == 0) {
                break; 
            }

            double diskon = 0;
            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            double totalBayar = jumlahTiket * hargaTiket * (1 - diskon);

            totalTiket += jumlahTiket;
            totalPendapatan += totalBayar;

            System.out.println("Diskon: " + (int) (diskon * 100) + "%");
            System.out.println("Total Bayar: Rp " + (int) totalBayar + "\n");
        }

        System.out.println("Total Tiket Terjual : " + totalTiket);
        System.out.println("Total pendapatan : Rp " + (int) totalPendapatan);
        
        input.close();
    }
}