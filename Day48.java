package ISC;

import java.util.ArrayList;
import java.util.Scanner;

public class Day48 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> ganjil = new ArrayList();
        ArrayList<Integer> genap = new ArrayList();

        for (int i = 0; i < 4; i++) {
            int nilai = sc.nextInt();

            if (nilai % 2 == 0) {
                genap.add(nilai);

            } else {
                ganjil.add(nilai);
            }

        }
        for (int i = 0; i < genap.size(); i++) {
            System.out.println("Array genap" + genap.get(i));
            System.out.println("Array ganjil" + ganjil.get(i));

        }

    }

}
