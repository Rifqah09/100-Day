package day90;

import java.util.Scanner;

public class Day90 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan sebuah bilangan: ");
            
            if (scanner.hasNextInt()) {
                int angka = scanner.nextInt();

                if (angka % 2 == 0) {
                    System.out.println("Genap");
                } else {
                    System.out.println("You and I end");
                    break;
                }
            } else {
                System.out.println("Masukkan bukan bilangan, coba lagi.");
                scanner.next(); 
            }
        }

        
 
    }
    
}
