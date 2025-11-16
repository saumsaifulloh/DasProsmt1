import java.util.Scanner;

public class Carimenukafe17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] menu = {
            "Nasgor Cak Slamet", "Nasi Warjo", "Preksu", "Es Teh", "Kopi Ireng", "Air Surga", "Darah Segar"
        };
        System.out.println("=== DAFTAR MENU ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i+1) + ". " + menu[i]);
        }
        System.out.print("\nMasukkan nama makanan yang ingin dicari: ");
        String cari = in.nextLine();
        boolean ditemukan = false;
        int posisi = -1;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                ditemukan = true;
                posisi = i;
                break;
            }
        }
        System.out.println("\n=== HASIL PENCARIAN ===");
        if (ditemukan) {
            System.out.println("Makanan \"" + cari + "\" tersedia di menu.");
            System.out.println("Berada pada urutan menu ke-" + (posisi + 1));
        } else {
            System.out.println("Maaf, makanan \"" + cari + "\" tidak ditemukan di menu.");
        }
    }
}
