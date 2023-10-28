package ISC;

import java.util.Scanner;

public class Day19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();
        int total = 15;
        while(angka >= 1){
            total -= angka;
            angka--;
            System.out.println("Hasil pengurangan : " + total);
        }
    }
}
