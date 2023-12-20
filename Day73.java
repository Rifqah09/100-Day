package Day73;

import java.util.Arrays;
public class Day73 {
    
    public static void main(String[] args) {
        String inisialisasi;

        char[] arrayKarakter = {'R', 'B', 'G', 'L', 'F', 'N', 'Z', 'S'};
        System.out.println("Huruf yang belum diurutkan: ");
        for (char urutanHuruf : arrayKarakter) {
            inisialisasi = "" + urutanHuruf;
            System.out.print(inisialisasi + " ");
        }
        Arrays.sort(arrayKarakter);
        System.out.println("\nHuruf yang sudah diurutkan: ");
        for (char urutanHuruf : arrayKarakter) {
            inisialisasi = "" + urutanHuruf;
            System.out.print(inisialisasi + " ");
        }
    }
    
}
