import  java.util.Scanner;

public class Triangle17 {
    public static void main(String[]aStrings) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N=");
        int N=sc.nextInt();
        int i=1;
        
        while(i <= N) {
            int j = 1;
            while (j<=i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }   
     }
}
