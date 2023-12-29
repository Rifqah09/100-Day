package Day82;

public class Day82 {
    
    public static void main(String[] args) {
        int[][] nilai = {
            {7, 1, 11},
            {4, 5, 8},
            {6, 2, 9}
        };

        int jumlahBaris = nilai.length;
        int jumlahKolom = nilai[0].length;

        for (int i = 0; i < jumlahBaris; i++) {
            int angkaTerakhir = nilai[i][jumlahKolom - 1];
            System.out.println("Angka terakhir pada baris ke-" + (i + 1) + ": " + angkaTerakhir);
        }
    }
    
}
