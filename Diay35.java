package day35;

import java.util.Scanner;
public class Day35 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double phi = 3.14;
        System.out.print("masukkan diameter lingkaran : ");
        double diameter = input.nextDouble();
        
        double jariJari = diameter / 2;
         
        double luas = phi * jariJari * jariJari;
        
        System.out.println("Luas lingkaran adalah : " + luas);
        
        
    }
    
}
