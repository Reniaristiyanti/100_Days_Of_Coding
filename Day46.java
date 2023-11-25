package ISC;

import java.util.Scanner;

public class Day46 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan angka: ");
        int angka = sc.nextInt();

        int[] numbers = new int[angka];
        for (int i = 0; i < angka; i++) {
            System.out.println("nilai :");
            int nilai = sc.nextInt();
            numbers[i] = nilai;

        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

        }

    }


}
