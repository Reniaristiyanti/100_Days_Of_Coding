package ISC;

import java.util.Scanner;

public class Day97 {
    static int pangkatTiga(int angka) {
        return angka * angka * angka;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan: ");
        int input = scanner.nextInt();

        int hasilPangkatTiga = pangkatTiga(input);

        System.out.println("Pangkat tiga dari " + input + " adalah " + hasilPangkatTiga);
    
        
    }
    
}
