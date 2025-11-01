import java.util.Scanner;

public class PO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String cabor = "";

        System.out.print("Masukkan jumlah Politeknik yang mendaftar: ");
        int jumlahPoliteknik = input.nextInt();
        input.nextLine(); // bersihkan enter setelah nextInt

        // Perulangan untuk setiap Politeknik
        for (int i = 1; i <= jumlahPoliteknik; i++) {
            System.out.println("\nPoliteknik ke-" + i);

            // Perulangan untuk setiap cabang olahraga
            for (int j = 1; j <= 4; j++) {
                if (j == 1) {
                    cabor = "Badminton";
                } else if (j == 2) {
                    cabor = "Tenis Meja";
                } else if (j == 3) {
                    cabor = "Basket";
                } else if (j == 4) {
                    cabor = "Bola Voli";
                }

                System.out.println("Cabang: " + cabor);

                // Perulangan untuk setiap atlet
                for (int n = 1; n <= 5; n++) {
                    System.out.print("  Masukkan nama atlet ke-" + n + ": ");
                    String namaAtlet = input.nextLine();  // harus nextLine, bukan next()
                    System.out.println("    -> Data disimpan: " + namaAtlet);
                }
                System.out.println();
            }
        }

        System.out.println("\n=== Semua data telah dimasukkan ===");
        input.close();
    }
}
