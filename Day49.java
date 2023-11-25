package ISC;

import java.util.ArrayList;
import java.util.Scanner;

public class Day49 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> artist = new ArrayList();

        System.out.print("Masukkan 10 nama artis: ");
        String artis = sc.next();

        for (int i = 0; i < 10; i++) {
            String nama = sc.next();
            artist.add(nama);

        }
        for (int i = 0; i < artist.size(); i++) {
            System.out.println("Artis ke- " + (i + 1) + artist.get(i));

        }
    }

}
