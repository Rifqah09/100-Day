package Day95;

import java.util.Scanner;

public class Day95 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan modal awal: ");
        double modalAwal = scanner.nextDouble();
        System.out.print("Masukkan lama investasi (dalam tahun): ");
        int lamaInvestasi = scanner.nextInt();
        double keuntungan = 0;
        for (int i = 1; i <= lamaInvestasi; i++) {
            keuntungan = modalAwal * 0.05;
            modalAwal += keuntungan;
            System.out.println("Keuntungan tahun ke-" + i + " adalah: " + keuntungan);
            System.out.println("Total modal setelah tahun ke-" + i + " adalah: " + modalAwal);
        }
   
    }
    
                               }
