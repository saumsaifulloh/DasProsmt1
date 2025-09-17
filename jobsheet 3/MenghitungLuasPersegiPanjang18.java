import java.util.Scanner;
public class MenghitungLuasPersegiPanjang18 {
    public static void main(String aString[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan panjang");
        int panjang = sc.nextInt();
        System.out.print("Masukan lebar");
        int lebar = sc.nextInt();

        double luas =panjang*lebar;
        System.out.println("Luas persegi adalah " +luas);

        sc.close();
    }
}