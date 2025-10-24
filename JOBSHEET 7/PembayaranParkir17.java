import java.util.Scanner;

public class PembayaranParkir17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan jenis kendaraan (1. Mobil, 2. Motor, 0=keluar): ");
            int jenis = input.nextInt();

            if (jenis == 0) {
                System.out.println("Keluar. Terima kasih.");
                break;
            }

            if (jenis != 1 && jenis != 2) {
                System.out.println("Jenis kendaraan tidak valid! Silakan masukkan ulang.");
                continue;
            }

            System.out.print("Masukkan durasi parkir(dalam jam): ");
            int durasi = input.nextInt();

            if (durasi < 0) {
                System.out.println("Durasi tidak valid! Silakan masukkan ulang.");
                continue;
            }

            int total = 0;
            if (jenis == 1) { 
                if (durasi <= 2) {
                    total = durasi * 5000;
                } else {
                    total = 2 * 5000 + (durasi - 2) * 3000;
                }
            } else { 
              
                if (durasi <= 2) {
                    total = durasi * 3000;
                } else {
                    total = 2 * 3000 + (durasi - 2) * 1500;
                }
            }

            System.out.println("Total biaya parkir: Rp " + total);
            System.out.println();
        }

        input.close();
    }
}