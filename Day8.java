package ISC;

import java.util.Scanner;

public class Day8 {
    public static void main(String[] args) {
        //Menghitung keliling persegi
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan panjang: ");
        int panjang = sc.nextInt();
        
        System.out.println("Masukkan lebar: ");
        int lebar = sc.nextInt();
        
        int keliling = panjang+lebar+panjang+lebar;
        
        System.out.println("Keliling persegi adalah: " + keliling);
        
    }
}
