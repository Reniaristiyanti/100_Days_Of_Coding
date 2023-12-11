package ISC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Day64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nilai = new ArrayList<>();
        
        for (int i = 0; i < 5; i++) {
            System.out.println("angka: ");
            int angka = sc.nextInt();
            nilai.add(angka);
            
        }
        
        Collections.sort(nilai);
        
        System.out.println(nilai);
    }
    
}
