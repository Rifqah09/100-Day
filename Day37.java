package coding37;
import java.util.Scanner;

public class Day37 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String bulan;
        
        System.out.print("Masukkan nama bulan : ");
        bulan = input.nextLine();
        
        switch(bulan){
            case "januari":
            System.out.println ("Bulan ke-1");
            break;
            case "februari":
            System.out.println ("Bulan ke-2");
            break;
            case "maret":
            System.out.println ("Bulan ke-3");
            break;
            case "april":
            System.out.println ("Bulan ke-4");
            break;
            case "mei":
            System.out.println ("Bulan ke-5");
            break;
            case "juni":
            System.out.println ("Bulan ke-6");
            break;
            case "Juli":
            System.out.println ("Bulan ke-7");
            break;
            case "agustus":
            System.out.println ("Bulan ke-8");
            break;
            case "september":
            System.out.println ("Bulan ke-9");
            break;
            case "oktober":
            System.out.println ("Bulan ke-10");
            break;
            case "november":
            System.out.println ("Bulan ke-11");
            break;
            case "desember":
            System.out.println ("Bulan ke-12");
            break;
            default:
            System.out.println("Nama bulan tidak valid ");
            
            
        }
    }
    
        }
