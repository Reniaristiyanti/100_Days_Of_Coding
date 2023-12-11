package ISC;

public class Day57 {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        
        int indeks = 2;
        if (indeks >= 0 && indeks < array.length) {
            System.out.println("Elemen pada indeks " + indeks + ":" + array[indeks]);
        }else{
            System.out.println("indeks tidak valid");
        }
    }
    
}
