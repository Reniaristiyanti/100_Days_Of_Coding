package ISC;

import java.util.HashMap;

public class Day72 {
    public static void main(String[] args) {
        HashMap<String, String> biodata = new HashMap<>();
        biodata.put("nama", "Reni");
        biodata.put("kelas", "D");
        biodata.put("nim", "D0221053");

        System.out.println("Nama: " + biodata.get("nama"));
        System.out.println("Kelas: " + biodata.get("kelas"));
        System.out.println("Nim: " + biodata.get("nim"));
    
    }
    
}
