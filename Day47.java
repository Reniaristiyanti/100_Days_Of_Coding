package ISC;

import java.util.ArrayList;
import java.util.Scanner;

public class Day47 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList();

        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();

        for (int i = 0; i < angka; i++) {
            int nilai = sc.nextInt();
            if (angka % 2 == 1) {
                numbers.add(nilai);
                System.out.println(numbers);

            }

        }
    }

}
