//CASE METHOD 
//MUHAMMAD SAUM SAIFULLOH/1E/18/SISTEM INFORMASI BISNIS

import java.util.Scanner;

public class CaseMethod18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("INPUT DATA MAHASISWA");
        System.out.print("NAMA: ");
        String nama = input.nextLine().trim();

        System.out.print("NIM: ");
        String nim = input.nextLine().trim();

        System.out.println(); 
        System.out.println("MATA KULIAH 1: Algoritma dan Pemrograman");
        String AlgoritmadanPemrograman = input.nextLine();
        System.out.print("NILAI UTS: ");
        double nilaiUTS1 = input.nextDouble();
        System.out.print("NILAI UAS: ");
        double nilaiUAS1 = input.nextDouble();
        System.out.print("NILAI TUGAS: ");
        double nilaiTugas1 = input.nextDouble();

        System.out.println(); 
        System.out.println("MATA KULIAH 2: Struktur Data");
        String StrukturData = input.nextLine().trim();
        System.out.print("NILAI UTS: ");
        double nilaiUTS2 = input.nextDouble();
        System.out.print("NILAI UAS: ");
        double nilaiUAS2 = input.nextDouble();
        System.out.print("NILAI TUGAS: ");
        double nilaiTugas2 = input.nextDouble();
       
        double nilaiAkhir1 = hitungNilaiAkhir(nilaiUTS1, nilaiUAS1, nilaiTugas1);
        double nilaiAkhir2 = hitungNilaiAkhir(nilaiUTS2, nilaiUAS2, nilaiTugas2);

        String Nilai1 = konversiNilai(nilaiAkhir1);
        String Nilai2 = konversiNilai(nilaiAkhir2);

        String Keterangan1 = (nilaiAkhir1 > 60)? "LULUS" : "TIDAK LULUS";
        String Keterangan2 = (nilaiAkhir2 > 60)? "LULUS" : "TIDAK LULUS";

        System.out.println();
        System.out.println("HASIL PENILAIAN AKADEMIK");
        System.out.println("NAMA: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("MATA KULIAH\t\tNILAI AKHIR\tNILAI HURUF\tKETERANGAN");
        System.out.printf("%s\t%.2f\t%s\t%s%n", AlgoritmadanPemrograman, nilaiAkhir1, Nilai1, Keterangan1);
        System.out.printf("%s\t%.2f\t%s\t%s%n", StrukturData, nilaiAkhir2, Nilai2, Keterangan2);

        double rataRata = (nilaiAkhir1 + nilaiAkhir2) / 2;
        String kelulusan = (rataRata >= 70)? "LULUS" : "TIDAK LULUS";

        System.out.printf("RATA-RATA NILAI AKHIR: %.2f%n", rataRata);
        System.out.println("keterangan Semester     : " + kelulusan);
        input.close();
    }
        public static double hitungNilaiAkhir(double uts, double uas, double tugas) {
            return (0.3 * uts) + (0.4 * uas) + (0.3 * tugas);
        }

        public static String konversiNilai(double nilaiAkhir) {
            if (nilaiAkhir >= 85) {
                return "A";
            } else if (nilaiAkhir >= 70) {
                return "B";
            } else if (nilaiAkhir >= 55) {
                return "C";
            } else if (nilaiAkhir >= 40) {
                return "D";
            } else {
                return "E";
            }
    }
}