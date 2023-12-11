package ISC;

import java.util.Scanner;

public class Day60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Masukkan jumlah item dalam array: ");
        int jumlahItem = scanner.nextInt();

        
        int[] array = new int[jumlahItem];

        
        System.out.println("Masukkan nilai untuk setiap item dalam array:");
        for (int i = 0; i < jumlahItem; i++) {
            System.out.print("Item ke-" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        
        System.out.print("Masukkan indeks item yang ingin ditampilkan: ");
        int indeksItem = scanner.nextInt();

        if (indeksItem >= 0 && indeksItem < jumlahItem) {
            System.out.println("Nilai item pada indeks " + indeksItem + ": " + array[indeksItem]);
        } else {
            System.out.println("Indeks tidak valid. Harap masukkan indeks yang sesuai dengan ukuran array.");
        }

        
        scanner.close();
    }
    
}
