import java.util.Scanner;

    public class RataNilai17{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int i= 1;
            int j= 1;
            int nilaimahasiswa;
            float nilai,totalNilai, RataNilai;

            for (i= 1; i<=5; i++) {

                System.out.println("Input Nilai Mahasiswa ke-" + i);

                totalNilai=0;

                for(j=1; j<=5; j++){
                    System.out.print("Nilai ke-" +j + " = ");
                    nilaimahasiswa=sc.nextInt();
                    totalNilai+=nilaimahasiswa;
                }
                RataNilai=totalNilai/5;
                System.out.println("  Rata-rata nilai mahasiswa ke-" + i + " = " + RataNilai);
            }
        }
        }