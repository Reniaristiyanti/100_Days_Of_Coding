package ISC;

import java.util.Scanner;

public class Day37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan batas ");
        int angka = input.nextInt();
        
        for (int i = 1; i <= angka; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(i);
                
            }
            
        }
    }
    
}
