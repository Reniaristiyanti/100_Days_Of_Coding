package ISC;

import java.util.Scanner;

public class Day8 {
    public static void main(String[] args) {
        //Menghitung keliling persegi
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan panjang: ");
        int Panjang = sc.nextInt();
        
        System.out.print("Masukkan lebar: ");
        int Lebar = sc.nextInt();
        
        int keliling = Panjang+Lebar+Panjang+Lebar;
        
        System.out.println("Keliling persegi adalah: " + keliling);
        
    }
}
