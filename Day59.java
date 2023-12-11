package ISC;

import java.util.Scanner;

public class Day59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] items = new String[5];


        System.out.println("Masukkan 5 item:");

        for (int i = 0; i < items.length; i++) {
            System.out.print("Item ke-" + (i + 1) + ": ");
            items[i] = scanner.nextLine();
        }


        System.out.println("\nItem yang dimasukkan:");

        for (String item : items) {
            System.out.println(item);
        }


        scanner.close();
    }
    
}
