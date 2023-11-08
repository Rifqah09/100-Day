package day31;
import java.util.Scanner;
public class Day31 {
  public static void main(String[] args) {
    Scanner input = new Scanner (Sysytem.in);
    System.out.println("Masukkan angka pertama: ");
      int angkaPertama = input.nextInt();
    System.out.println("Masukkan angka kedua: ");
      int angkaKedua = input.nextInt();

    if (angkaPertama < angkaKedua) {
      System.out.println("Tampilkan agka pertama: " + angkaPertama);
    } else {
      System.out.println("Tampilkan angka kedua: " + angkaKedua);

    }

  }

}
