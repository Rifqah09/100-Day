package day94;

import java.util.Scanner;

public class Day94 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan batas atas: ");
        int batasAtas = sc.nextInt();
        int jumlah = 0;
        for (int i = 1; i < batasAtas; i++) {
            if (i % 3 == 0) {
                jumlah++;
            }
        }
        System.out.println("Jumlah angka yang habis dibagi 3 adalah: " + jumlah);

    }
    
}
