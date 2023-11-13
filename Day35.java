package ISC;

import java.util.Scanner;

public class Day35 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();
        int ganjil = 0;
        int genap = 0;

        for (int i = 1; i <= angka; i++) {
            System.out.println(i);
            if (i % 2 == 0) {
                genap += i;

            } else {
                ganjil += i;

            }

        }
        System.out.println("angka genap " + genap);
        System.out.println("angka ganjil " + ganjil);
    }

}

