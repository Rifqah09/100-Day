package day24;
import java.util.Scanner;
public class Day24 {


    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int belanja = 0;

      System.out.print("Total belanja: Rp ");
      belanja = scan.nextInt();

      if (belanja > 200000 ) {
        System.out.println("Selamat, anda mendapatkan diskon!");

      System.out.println("Terima kasih sudah berbelanja...");
      }

    }

}
