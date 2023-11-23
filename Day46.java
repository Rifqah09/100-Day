package Day46;
import java.util.Scanner;

public class Day46 {
    
    public static void main(String[] args) {
        String[] motor = new String[4];
        Scanner scan = new Scanner(System.in);

        
        for( int i = 1; i < motor.length; i++ ){
            System.out.print("Motor ke-" + i + ": ");
            motor[i] = scan.nextLine();
        }

        System.out.println("---------------------------");

        
        for( String b : motor ){
            System.out.println(b);
        }

    }

        
    }

              
