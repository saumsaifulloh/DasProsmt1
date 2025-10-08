import java.util.Scanner;

public class casemethod18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // MATA KULIAH 1
        System.out.println("MATA KULIAH 1: Algoritma dan Pemrograman");

        System.out.print("Nama Mata Kuliah 1: ");
        String mataKuliah1 = input.nextLine().trim();

        System.out.print("NILAI UTS: ");
        double nilaiUTS1 = input.nextDouble();

        System.out.print("NILAI UAS: ");
        double nilaiUAS1 = input.nextDouble();

        System.out.print("NILAI TUGAS: ");
        double nilaiTugas1 = input.nextDouble();
        input.nextLine();

        System.out.println("---MATA KULIAH 2: Struktur Data---");

        System.out.print("Nama Mata Kuliah 2: ");
        String mataKuliah2 = input.nextLine().trim();

        System.out.print("NILAI UTS: ");
        double nilaiUTS2 = input.nextDouble();

        System.out.print("NILAI UAS: ");
        double nilaiUAS2 = input.nextDouble();

        System.out.print("NILAI TUGAS: ");
        double nilaiTugas2 = input.nextDouble();

        String pesan = "";
        
    }
}
