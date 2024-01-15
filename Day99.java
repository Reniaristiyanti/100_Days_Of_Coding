package ISC;

import java.util.Scanner;

public class Day99 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kalimat: ");
        String kalimat = scanner.nextLine();

        int jumlahKata = hitungJumlahKata(kalimat);

        System.out.println("\nJumlah kata: " + jumlahKata);

        scanner.close();
    }

    private static int hitungJumlahKata(String kalimat) {
        String[] kataArray = kalimat.split(" ");
        return kataArray.length;
    }
    
}
