import java.util.Scanner;
public class GajiBuJesi18{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan gaji pokok : ");
        int gaji = sc.nextInt();
        System.out.print("Masukkan jumlah anak : ");
        int jumlahAnak = sc.nextInt();
        System.out.print("Masukann tunjangan anak per anak : ");
        int tunjanganAnak = sc.nextInt();

        double totalTunjangan = jumlahAnak * tunjanganAnak;
        double potongPensiun = gaji*0.05;
        double Gaji = gaji + totalTunjangan - potongPensiun;

        System.out.println("Gaji bersih bu jesi = " + Gaji);
    }
}