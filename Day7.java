package ISC;

import java.util.Scanner;

public class Day7 {
    public static void main(String[] args) {
        //Menginput nama,umur dan jenis kelamin  menggunakan scanner
        Scanner sc = new Scanner(System.in);
        
        String Nama ;
        int umur;
        char Jeniskelamin;
        
        System.out.print("Masukkan nama: ");
        Nama = sc.nextLine();
        System.out.println("Nama saya adalah:" + Nama);
        System.out.print("Masukkan umur: ");
        umur = sc.nextInt();
        System.out.println("Umur saya adalah:" + umur + "Tahun");
        System.out.print("Masukkan Jenis kelamin: ");
        Jeniskelamin = sc.next().charAt(0);
        System.out.println("Jenis kelamin saya: " + Jeniskelamin);
        
        
        
    }
    
}
