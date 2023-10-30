package ISC;

import java.util.Scanner;

public class Day20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan angka:");
        int angka = sc.nextInt();
        int total =10;
        for (int i = 9; i >= 1; i--) {
            total -= i;
            
        }
        System.out.println("Hasil pengurangan :" + total);
    }
    
}
