package ISC;

import java.util.ArrayList;
import java.util.Scanner;

public class Day50 {

    public static void main(String[] args) {
        ArrayList<Integer> angkaGanjil = new ArrayList();

        for (int i = 1; i <= 20; i += 2) {
            angkaGanjil.add(i);

        }
        System.out.println("Array list yang berisi 10 angka ganjil: " + angkaGanjil);

        int total = 0;
        for (int angka : angkaGanjil) {
            total += angka;

        }
        if (total % 2 == 0) {
            total += 2;
        }
        System.out.println("Hasil penjumlahan " + total);
    }

}
