package ISC;

import java.util.ArrayList;
import java.util.Scanner;

public class Day96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> namaa = new ArrayList();

        System.out.print("Masukkan 10 nama : ");
        String namaaa = sc.next();

        for (int i = 0; i < 10; i++) {
            String nama = sc.next();
            namaa.add(nama);

        }
        for (int i = 0; i < namaa.size(); i++) {
            System.out.println("Artis ke- " + (i +1) + namaa.get(i));
            
        }
    }
    
}
