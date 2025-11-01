import java.util.Scanner;

public class SOAL2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String cabor = "";
        
        System.out.print("Masukkan jumlah politeknik mendaftar: ");
        int jumlahpoliteknik = input.nextInt();
        input.nextLine();

        for (int i=1; i <=jumlahpoliteknik; i++) {
            System.out.println("Politeknik ke-" + i);
           
            for(int j=1; j<=4; j++) {
                if (j == 1 ) {
                    cabor = "Badminton";
                } else if (j == 2) {
                    cabor = "Tenis Meja";
                } else if (j == 3) {
                    cabor = "Basket";
                } else if (j == 4) {
                    cabor = "Bola Voli";
                }

            System.out.println("cabor: " + cabor);

                for (int n = 1; n <= 5; n++) {
                    System.out.print("Masukkan Nama Atlet ke:" + n + ": ");
                    String NamaAtlet = input.nextLine();
                    System.out.println("data tersimpan: " + NamaAtlet);
                }
            System.out.println();
        }
    }       
            System.out.println("Semua data telah dimasukkan");
    }
}   