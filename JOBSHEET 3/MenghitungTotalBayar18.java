import java.util.Scanner;
public class MenghitungTotalBayar18 {
    public static void main(String asStrings[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("harga : ");
        double diskon=0.15;

        int harga=sc.nextInt();
        double potongan =diskon*harga;
        double jml_bayar=harga-potongan;

        System.out.println("jumlah potongan harga adalah Rp. : " +potongan);
        System.out.println("jumlah yang harus anda bayar adalah Rp. " + jml_bayar);

        sc.close();
    }
}