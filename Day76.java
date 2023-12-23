package Day76;

import java.util.Arrays;
import java.util.Scanner;

public class Day76 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Jumlah Element: ");
        int ukuran = input.nextInt();
        int[] angka = new int[ukuran];
        System.out.println("Masukan Nilai/Element: ");
        for (int j = 0; j < ukuran; j++) {
            angka[j] = input.nextInt();
        }
        Arrays.sort(angka);
        System.out.println("----Berhasil di urutkan---- ");
        for (int index : angka) {
            System.out.println(index);
            }
    }
    
}
