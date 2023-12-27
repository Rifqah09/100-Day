package Day80;

import java.util.Arrays;

public class Da80 {
    
    public static void main(String[] args) {
        
        int[] angka = {5, 8, 2, 10, 4};
        Arrays.sort(angka);

        double median;

        if (angka.length % 2 == 0) {
            int tengah1 = angka[angka.length / 2 - 1];
            int tengah2 = angka[angka.length / 2];
            median = (double) (tengah1 + tengah2) / 2;
        } else {
            median = angka[angka.length / 2];
        }

        System.out.println("Nilai tengah (median): " + median);
    
    }
    
}
