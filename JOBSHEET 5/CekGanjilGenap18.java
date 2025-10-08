//SOAL 2. CekGanjilGenap.java
//MUHAMMAD SAUM SAIFULLOH /1E/18/SISTEM INFORMASI BISNIS  


import java.util.Scanner;  

public class CekGanjilGenap18 {
    public static void main(String[] args) {
        int angka;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        angka = input.nextInt();

        if (angka % 2 == 0) {
            System.out.println(angka + " adalah bilangan genap.");
        } else {
            System.out.println(angka + " adalah bilangan ganjil.");

        input.close();
        }
    }
}
