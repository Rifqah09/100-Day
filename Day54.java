package Day54;

import java.util.Scanner;

public class Day54 {
    
    public static void main(String[] args) {
        Scanner atm = new Scanner(System.in);

       int alatTulis = 5;
       String[] items = new String[alatTulis];

       System.out.println("Masukkan " + alatTulis + " Alat tulis :");
       for (int i = 0; i < alatTulis; i++) {
           items[i] = atm.nextLine();
       }

       System.out.println("Daftar alat tulis yang disimpan:");
       for (int i = 0; i < alatTulis; i++) {
           System.out.println((i+1) + ". " + items[i]);
       }
   }
        
    }

         
