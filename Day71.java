package Day71;

public class Day71 {
    
    public static void main(String[] args) {
          int[] angka = {19, 21, 34, 4, 52};
        int indeksYangDiganti = 2;
        int angkaPengganti = 10;

        System.out.println("Array sebelum diganti:");
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }

        angka[indeksYangDiganti] = angkaPengganti;

        System.out.println("\nArray setelah diganti:");
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }
    }

             }
