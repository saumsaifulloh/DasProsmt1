import java.util.Scanner;

public class BiayaBensin18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jarak
        System.out.print("Masukkan jarak dari Malang ke Surabaya (km): ");
        double jarak = input.nextDouble();

        // Validasi input
        if (jarak <= 0) {
            System.out.println("Jarak harus lebih dari 0.");
            return;
        }

        // Konstanta
        double konsumsiPerKm = 1.0 / 2;  // 1 liter per 2 km
        double hargaPerLiter = 10000;   // Harga bensin

        // Hitung jumlah liter dan biaya
        double totalLiter = jarak * konsumsiPerKm;
        double totalBiaya = totalLiter * hargaPerLiter;

        System.out.printf("Biaya bensin untuk perjalanan %.2f km adalah: Rp %.2f\n", jarak, totalBiaya);

        input.close();
    }
}
