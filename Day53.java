package Day53;

import java.util.Scanner;

public class Day53 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah inputan: ");
        int jumlahInput = scanner.nextInt();
        
        int[] inputanArray = new int[jumlahInput];
        
        for (int i = 0; i < jumlahInput; i++) {
            
            System.out.print("Masukkan nilai: ");
            inputanArray[i] = scanner.nextInt();

            
            if (inputanArray[i] % 2 == 0) {
                System.out.println("Genap");
            } else {
                System.out.println("Ganjil");
            }
        }
    }
}


