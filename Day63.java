package ISC;

import java.util.ArrayList;
import java.util.Scanner;

public class Day63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> umurMahasiswa = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("umur mahasiswa: ");
            int umur = scanner.nextInt();
            umurMahasiswa.add(umur);
        }

        System.out.println("Data umur mahasiswa: ");
        for (int umur : umurMahasiswa) {
            System.out.println(umur);
        }

    }
    
}
