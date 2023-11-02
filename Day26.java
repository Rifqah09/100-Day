package haridalamaseminggu;

import java.util.Scanner;
public class HariDalamSeminggu {
   public static void main(String[] args) {
     Scanner scan = new Scanner (System.in);
     System.out.println("Masukkan Nomor Hari (1-7) : ");
     int nomorHari = scan.nextInt();
     String namaHari;

     switch (nomorHari) {
       case 1:
         namaHari = "Senin";
         break;
       case 2:
         namaHari = "Selasa";
         break;
       case 3:
         namaHari = "Rabu";
         break;
       case 4:
         namaHari = "Kamis";
         break;
       case 5:
         namaHari = "Jumat";
         break;
       case 6:
         namaHari = "Sabtu";
         break;
       case 7:
         namaHaru = "Minggu";
         break;
       default:
         namaHari = "Hari tidak valid";
         break;
     }
     System.out.println("Hari ke-" + nomorHari + "adalah" + namaHari);

   }
}
