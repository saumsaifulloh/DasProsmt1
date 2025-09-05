import java.util.Scanner;

public class Segitiga18 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alas = sc.nextInt();
        int tinggi = sc.nextInt();
        float luas = sc.nextInt();

        System.out.println(" 40 : ");
        alas = sc.nextInt();
        System.out.println(" 175 : ");
        tinggi = sc.nextInt();

        luas = alas * tinggi / 2;
        System.out.println("luas segitiga: " +luas);
        sc.close();
}
}