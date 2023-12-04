package ISC;

import java.util.Scanner;

public class Day55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan nilai batas perulangan: ");
        int batasPerulangan = sc.nextInt();
        
        sc.close();
        
        for (int i = batasPerulangan; i >= 1; i--) {
            System.out.println("Nilai i: " + i);
            
        }
        System.out.println("Perulangan selesai");
    }
    
}
