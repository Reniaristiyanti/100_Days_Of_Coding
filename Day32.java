package ISC;

public class Day32 {
    public static void main(String[] args) {
        double gajiPokok = 5000000;
        int jamLembur = 10;
        
        double gajiLembur = 1.5 * jamLembur * 100000;
        double gajiKotor = gajiPokok + gajiLembur;
        
        System.out.println("Gaji kotor karyawan: Rp. " +gajiKotor);
    }
    
}
