package Day79;

import java.util.Scanner;
public class Day79 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah hari: ");
        int jumlahHari = scanner.nextInt();
        
        System.out.print("Masukkan jumlah jam pelajaran: ");
        int jumlahJam = scanner.nextInt();
        
        String[][] jadwal = new String[jumlahHari][jumlahJam];
        
        // Mengisi jadwal pelajaran
        for (int i = 0; i < jumlahHari; i++) {
            for (int j = 0; j < jumlahJam; j++) {
                System.out.print("Masukkan pelajaran untuk hari " + (i+1) + " jam ke-" + (j+1) + ": ");
                jadwal[i][j] = scanner.next();
            }
        }
        
        // Menampilkan jadwal pelajaran
        for (int i = 0; i < jumlahHari; i++) {
            for (int j = 0; j < jumlahJam; j++) {
                System.out.print(jadwal[i][j] + "\t");
            }
            System.out.println();
        }
        
        
    
    }
    
}
