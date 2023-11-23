package ISC;

public class Day44 {

    public static void main(String[] args) {
        System.out.println("Angka ganjil antara 1 sampai 100 yang bisa dibagi 3 : ");

        int angka = 1;
        while (angka <= 100) {
            if (angka % 2 == 1 && angka % 3 == 0) {
                System.out.println(angka + " ");
            }
            angka++;
        }

        System.out.println();
    }

    
}


