package day25;

import java.util.Scanner;
public class Day25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Masukkan umur anda : ");

        int umur = scanner.nextInt();

        System.out.println("Apakah anda memiliki izin dari orang tua? (true/false) : ");
        boolean izinOrangTua = scanner.nextBoolean();

        if (umur >= 18) {
          System.out.println("Anda cukup umur");
          if (izinOrangTua) {
            System.out.println("Anda memiliki izin orang tua");


        } else {
             System.out.println("Anda tidak memiliki izin orang tua ");
          }
          } else {
                System.out.println("Anda belum cukup umur");
          }
    }
}
