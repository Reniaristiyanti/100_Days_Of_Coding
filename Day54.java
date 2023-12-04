package ISC;

import java.util.Scanner;

public class Day54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan beberapa angka(pisahkan dengan spasi): ");
        String input = sc.nextLine();
        
        String [] numbersAsString = input.split(" ");
        
        int [] numbers = new int[numbersAsString.length];
        
        for (int i = 0; i < numbersAsString.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsString[i]);
            
        }
        System.out.println("\nMenggunakan For Each: ");
        for( int num : numbers) {
            System.out.println(num);
        }
        sc.close();
    }
    
}