package ISC;

import java.util.Scanner;

public class Day9 {
    public static void main(String[] args) {
        //Operator Penugasan Penjumlahan
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan angka pertama: ");
        int angkaPertama = sc.nextInt();
        
        System.out.print("Masukkan angka kedua: ");
        int angkaKedua = sc.nextInt();
        
        angkaPertama += angkaKedua;
        System.out.println("Hasil opertor penugasan: angka pertama += angka kedua adalah: " + angkaPertama);
        
        sc.close();
        
        }
    
}
