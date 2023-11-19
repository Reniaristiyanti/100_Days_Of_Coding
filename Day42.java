package ISC;

import java.util.Scanner;

public class Day42 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai awal: ");
        int nilaiAwal = sc.nextInt();
        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = sc.nextInt();

        for (int i = batasAkhir; i <= nilaiAwal; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "Adalah bilangan Genap ");

            } else {
                System.out.println(i + "Adalah bilangan Ganjil ");
            }

        }

    }

}
