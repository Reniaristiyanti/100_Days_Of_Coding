package ISC;

import java.util.Scanner;

public class Day74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();


        while (n <= 0) {
            System.out.println("Masukkan nilai n harus lebih besar dari 0.");
            System.out.print("Masukkan nilai n: ");
            n = sc.nextInt();
        }


        int jumlahGanjil = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                jumlahGanjil += i;
            }
        }

        System.out.println("\nJumlah bilangan ganjil dari 1 hingga " + n + " adalah: " + jumlahGanjil);


        sc.close();
    }
    
}
