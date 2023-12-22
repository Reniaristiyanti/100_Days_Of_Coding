package ISC;

import java.util.Scanner;

public class Day76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama depan: ");
        String namaDepan = sc.nextLine();

        System.out.print("Masukkan nama belakang: ");
        String namaBelakang = sc.nextLine();


        String namaLengkap = namaDepan + " " + namaBelakang;
        int panjangNamaDepan = namaDepan.length();
        int panjangNamaBelakang = namaBelakang.length();


        System.out.println("\nNama lengkap: " + namaLengkap);
        System.out.println("Panjang nama depan: " + panjangNamaDepan);
        System.out.println("Panjang nama belakang: " + panjangNamaBelakang);

        sc.close();
    }
}
