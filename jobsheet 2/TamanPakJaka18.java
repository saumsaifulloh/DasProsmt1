import java.util.Scanner;

public class TamanPakJaka18
 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang tanah (meter): ");
        int panjang = input.nextInt();
        System.out.print("Masukkan lebar tanah (meter): ");
        int lebar = input.nextInt();
        System.out.print("Masukkan diameter kolam lingkaran (meter): ");
        int diameter = input.nextInt();
        System.out.print("Masukkan sisi kolam persegi (meter): ");
        int sisi = input.nextInt();

        int luasTanah = panjang * lebar;

        double r = diameter / 2.0;
        double luasLingkaran = Math.PI * r * r;

        int luasPersegi = sisi * sisi;

        double luasKolam = luasLingkaran + luasPersegi;
        double luasRumput = luasTanah - luasKolam;

        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Luas Tanah        : " + luasTanah + " m²");
        System.out.println("Luas Kolam Bulat  : " + luasLingkaran + " m²");
        System.out.println("Luas Kolam Persegi: " + luasPersegi + " m²");
        System.out.println("Total Luas Kolam  : " + luasKolam + " m²");
        System.out.println("Luas Tanah Rumput : " + luasRumput + " m²");

        input.close();
    }
}
