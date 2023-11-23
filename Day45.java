package ISC;

import java.util.Scanner;

public class Day45 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka1: ");
        int angka1 = sc.nextInt();
        System.out.print("Masukkan angka2: ");
        int angka2 = sc.nextInt();
        System.out.print("Masukkan angka3: ");
        int angka3 = sc.nextInt();

        int total = 0;
        total = angka1 + angka2 + angka3;
        if (total % 2 == 0) {
            total += 2;
            System.out.println("Total penjumlahan = " + total);
        }else{
            total += 1;
            System.out.println("Total penjumlahan = " + total);
        }

    }

}
