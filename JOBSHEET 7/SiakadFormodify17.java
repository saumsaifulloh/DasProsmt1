import java.util.Scanner;

public class SiakadFormodify17 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double nilai, tertinggi = 0, terendah = 100;
       int Lulus = 0, tidakLulus = 0;
       for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai ke-" + i + ": ");
            nilai = sc.nextDouble();
           if (nilai > tertinggi) {
               tertinggi = nilai;
           }   
           if (nilai < terendah) {
               terendah = nilai;
           }
           if (nilai >= 60) {
               Lulus++; 
           } else { 
               tidakLulus++;
           }
       }
         System.out.println("Nilai tertinggi: " + tertinggi);
            System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah Mahasiswa Lulus: " + Lulus);
        System.out.println("Jumlah Mahasiswa Tidak Lulus: " + tidakLulus);
    }
}
