package Day52;

import java.util.Scanner;

public class Day52 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilaiUTS[] = new int[5];
        
            for(int i = 0; i<nilaiUTS.length; i++) {
                System.out.print("Masukkan nilai UTS ke - " +i +": ");
                nilaiUTS[i] = input.nextInt(); 
                
            }
            
            for(int i = 0; i<nilaiUTS.length; i++){
                if(nilaiUTS[i] > 65){
                    System.out.println("Mahasiswa ke- "+i+ " Lulus");
                }
    
            }
            
    }
    
  }
