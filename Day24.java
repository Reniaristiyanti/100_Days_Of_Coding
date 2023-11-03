package ISC;

import java.util.Scanner;

public class Day24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char jawaban;
        
        do{
            System.out.print("Apakah anda ingin mengulang (y/n)");
            jawaban = sc.next().charAt(0);
            
            if (jawaban == 'y'|| jawaban == 'Y'){
                System.out.println("Perulangan dilanjutkan.");
        }else if (jawaban =='n'|| jawaban == 'N'){
                System.out.print("Prulangan dihentikan.");
        }else{
                System.out.print("Maukan tidak valid. Silahkan masukkan 'y' atau 'n'.");
        }
            
         
        }while (jawaban != 'n' && jawaban != 'N');
        
        
    }
    
}
