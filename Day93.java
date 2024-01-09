package day93;

import java.util.Scanner;

public class Day93 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan angka pertama:");
        int no1 = sc.nextInt();

        System.out.println("Masukkan angka kedua:");
        int no2 = sc.nextInt();

        int angka = no1 + no2;

        if (angka % 2 == 0) {
            angka += 1;
        } else {
            angka += 2;
        }

        System.out.println("Hasilnya adalah: " + angka);
    
    }
    
}
