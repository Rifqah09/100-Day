package Day89;

import java.util.Scanner;

public class day89 {
    
    public static void main(String[] args) {
         
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Masukkan batas nilai atas: ");
        int batasAtas = scanner.nextInt();

        int total = 0;

        
        for (int i = 1; i <= batasAtas; i++) {
            total += i;
        }

        
        System.out.println("Total penjumlahan dari 1 hingga " + batasAtas + " adalah: " + total);
    
    }
    
              }
