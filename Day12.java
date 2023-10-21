package ISC;

import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {
        //Menghitung luas persegi menggunakan scanner
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan panjang: ");
        int panjang = sc.nextInt();
        
        System.out.print("Masukkan lebar: ");
        int lebar = sc.nextInt();
        
        int luas = panjang * lebar;
        System.out.println("Jadi luas persegi adalah: " + luas);
        
    }
    
}
