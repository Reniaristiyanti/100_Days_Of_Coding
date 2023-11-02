package ISC;

import java.util.Scanner;

public class Day21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka pilihan:");
        int angka = sc.nextInt();
        
        switch(angka){
            case 1:
                System.out.println("Anda memilih angka 1");
                break;
            case 2:
                System.out.println("Anda memilih angka 2");
                break;
            case 3:
                System.out.println("Anda memilih angka 3");
                break;
            default:
                System.out.println("Pilihan valid");
       
        }
        sc.close();
        
    }
    
}
