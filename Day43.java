package ISC;

import java.util.Scanner;

public class Day43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();
        
        while(angka != 0){
            if(angka % 2 == 0){
                System.out.println(angka+ "adalah bilangan Genap");
            }else{
                System.out.println(angka+ "adalah bilangan Ganjil");
            }
            
            System.out.println("Masukkan angka {masukkan 0 untuk keluar}: ");
            angka = input.nextInt();
        }
        
        System.out.println("Program selesai");
    }
    
}
