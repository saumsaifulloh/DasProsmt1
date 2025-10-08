//PERCOBAAN 2
// MUHAMMAD SAUM SAIFULLOH /1E/18/SISTEM INFORMASI BISNIS

import java.util.Scanner;

public class switchCetakKRS18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("--- Cetak KRS SIAKAD ---");
        System.out.print("Masukkan semester saat ini: ");
        String semester = input.next();
        input.close();

        switch (semester) {
            case "1":
                System.out.println("KRS semester 1 ditampilkan");
                break;
            case "2":
                System.out.println("KRS semester 2 ditampilkan");
                break;
            case "3":
                System.out.println("KRS semester 3 ditampilkan");
                break;
            case "4":
                System.out.println("KRS semester 4 ditampilkan");
                break;
            case "5":
                System.out.println("KRS semester 5 ditampilkan");
                break;
            case "6":
                System.out.println("KRS semester 6 ditampilkan");
                break;
            case "7":
                System.out.println("KRS semester 7 ditampilkan");
                break;
            case "8":
                System.out.println("KRS semester 8 ditampilkan");
                break;
            default:
                System.out.print("Semester tidak valid.");
                break;
        }
    }
    
}
