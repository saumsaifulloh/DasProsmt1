import java.util.Scanner;

public class Mengelolapemesanan17 {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

       String[] menuNama = {
            "Nasgor Cak Slamet", "Nasi Warjo", "Preksu", "Es Teh", "Kopi Ireng", "Air Surga", "Darah Segar"
        };
        int[] menuHarga = {
            15000, 14000, 18000, 5000, 8000, 10000, 200000
        };

        System.out.println("=== MENU KAFE ===");
        for (int i = 0; i < menuNama.length; i++) {
            System.out.println((i+1) + ". " + menuNama[i] + " - Rp" + menuHarga[i]);
        }

        System.out.print("\nJumlah pesanan: ");
        int jumlah = in.nextInt();

        String[] pesananNama = new String[jumlah];
        int[] pesananHarga = new int[jumlah];
        int total = 0;

        for (int i = 0; i < jumlah; i++) {
            System.out.print("\nPilih menu ke-" + (i+1) + " (1-" + menuNama.length + "): ");
            int pilih = in.nextInt();

            pesananNama[i] = menuNama[pilih - 1];
            pesananHarga[i] = menuHarga[pilih - 1];
            total += pesananHarga[i];
            
        }
        System.out.println("\n=== DAFTAR PESANAN ANDA ===");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i+1) + ". " + pesananNama[i] + " - Rp" + pesananHarga[i]);
        }

        System.out.println("\nTotal biaya: Rp" + total);
    }
}