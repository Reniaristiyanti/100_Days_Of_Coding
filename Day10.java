package ISC;

import java.util.Scanner;

public class Day10 {
    public static void main(String[] args) {
        //Operator aritmatika menggunakan scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = sc.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = sc.nextDouble();

        System.out.println("Hasil Penjumlahan: " + (angka1 + angka2));
        System.out.println("Hasil Pengurangan: " + (angka1 - angka2));
        System.out.println("Hasil Perkalian: " + (angka1 * angka2));
        System.out.println("Hasil Pembagian: " + (angka1 / angka2));

        sc.close();
    }
    
}
