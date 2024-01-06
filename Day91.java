package day91;

import java.util.Scanner;

public class Day91 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int number = sc.nextInt();

        
    
    
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Master Class");
        } else if (number % 3 == 0) {
            System.out.println("Pride of 3");
        } else if (number % 5 == 0) {
            System.out.println("Pride of 5");
        } else {
            System.out.println("");
        }
    
    }
    
    }
