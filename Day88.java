package Day88;

import java.util.Scanner;

public class Day88 {
    
    public static void main(String[] args) {
        double pajak;
        double hargaTanahPerMeter = 300000;
        Scanner input = new Scanner(System.in);
        double luas = input.nextDouble();

        
        double totalHarga = luas * hargaTanahPerMeter;

        
        if (totalHarga >= 50000000 && totalHarga < 100000000) {
            pajak = 0.03 * totalHarga;
        } else if (totalHarga >= 100000000) {
            pajak = 0.05 * totalHarga;
        } else {
            pajak = 0.01 * totalHarga;
        }

        
        double uangNetto = totalHarga - pajak;

        System.out.println("Total uang yang akan didapatkan: " + uangNetto);
    
    }
    
}
