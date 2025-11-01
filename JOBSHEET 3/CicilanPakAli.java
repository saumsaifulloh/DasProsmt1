import java.util.Scanner;

public class CicilanPakAli {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data
        System.out.print("Masukkan harga motor (Rp): ");
        double hargaMotor = input.nextDouble();

        System.out.print("Masukkan uang muka (Rp): ");
        double uangMuka = input.nextDouble();

        System.out.print("Masukkan lama cicilan (bulan): ");
        int lamaCicilan = input.nextInt();

        // Validasi
        if (hargaMotor <= 0 || uangMuka < 0 || lamaCicilan <= 0 || uangMuka >= hargaMotor) {
            System.out.println("Input tidak valid. Harap masukkan nilai yang benar.");
            return;
        }

        // Hitung cicilan per bulan
        double sisaPembayaran = hargaMotor - uangMuka;
        double cicilanPerBulan = sisaPembayaran / lamaCicilan;
        System.out.printf("Jumlah cicilan per bulan yang harus dibayar Pak Ali adalah: Rp %.2f\n", cicilanPerBulan);
    }
}
