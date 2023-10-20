package ISC;

import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
        //operator logika
        Scanner sc = new Scanner(System.in);
        int umur = 0;
        boolean punyaSim = false;
        
        System.out.print("Masukkan Umur: ");
        umur = sc.nextInt();
        System.out.println("Apakah saya memiliki ktp? (Y/T): ");
        punyaSim = sc.next().equals("Y");
        
        if(umur >= 17 && punyaSim){
            System.out.println("Saya bisa mengendarai kendaraan.");
        }else{
            System.out.println("Saya tidak bisa mengendarai kendaraan.");
        }
    }
    
}
