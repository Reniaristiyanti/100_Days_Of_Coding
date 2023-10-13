package ISC;

public class Day5 {
    public static void main(String[] args) {
        //Mengkonversi Tipe data primitif ke String
        
        //Deklarasi variabel tipe data primitif
        int umur = 20;
        short BeratBadan = 51;
        char JenisKelamin = 'P';
        boolean Mahasiswa = true;
        
        //Konversi tipe data primitif ke String
        String strUmur = String.valueOf(umur);
        String strBeratbadan = String.valueOf(BeratBadan);
        String strJeniskelamin = String.valueOf(JenisKelamin);
        String strmahasiswa = String.valueOf(Mahasiswa);
        
        System.out.println("Umur: " + strUmur);
        System.out.println("Berat badan: " + strBeratbadan);
        System.out.println("Jenis kelamin: " + strJeniskelamin);
        System.out.println("Mahasiswa: " + strmahasiswa);
    }
    
}
