package ISC;

import java.util.Scanner;

public class Day100 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Masukkan batas : ");
         int batas = sc.nextInt();
         
         for (int j = 1; j <= batas; j++) {
             if( j % 3 == 0 && j % 5 == 0){
                 System.out.println(j);
             }
            
        }
    }
    
}
