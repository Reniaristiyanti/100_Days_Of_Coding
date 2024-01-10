package ISC;

import java.util.Scanner;

public class Day94 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        System.out.print("Input tinggi segitiga: ");
        int tinggiSegitiga = scanner.nextInt();
        System.out.println();

        for (int i = 1; i <= tinggiSegitiga; i++) {
            for (int j = tinggiSegitiga - i + 1; j > 0; j--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }  
    }
    
}
