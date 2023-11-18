package bilanganPositif;
import java.util.Scanner;

public class bilangan {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan bilangan bulat: ");
        
        int bilangan;
        int jumlahPositif = 0;
        
        
        do {
            System.out.print("Bilangan : ");
            bilangan = input.nextInt();
            
            if (bilangan > 0) {
                jumlahPositif += bilangan;
            }
        } while (bilangan >= 0);
        System.out.println("Jumlah Bilangan positif : " + jumlahPositif);
        
    }
    
    }
