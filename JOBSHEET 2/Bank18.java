import java.util.Scanner;

public class Bank18 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int jml_tabungan_bunga_awal, lama_menabung;
        double prosentase_bunga =0.02, bunga , jml_tabungan_bunga_akhir;

        System.out.println("masukan jumlah tabungan (dalam bulan): ");
        jml_tabungan_bunga_awal = input.nextInt();
        System.out.println("masukan lama tabungan (dalam bulan): ");
        lama_menabung = input.nextInt();

        bunga= lama_menabung*prosentase_bunga*jml_tabungan_bunga_awal;
        jml_tabungan_bunga_akhir=bunga = jml_tabungan_bunga_awal;

        System.out.println("Bunga adalah" +bunga);
        System.out.println("Jumlah tabungan akhir anda adalah" +jml_tabungan_bunga_akhir);
        input.close();
    }
}