package ISC;

import java.util.Scanner;

public class Day33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);   
        }
        
        System.out.println("Masukkan angka: ");
        int input = sc.nextInt();
        
        if (input == 80) {
            System.out.println("Angka ditemukan");
        }
    }
    
}
