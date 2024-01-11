package day96;

public class Day96 {
    
    public static void main(String[] args) {
        int[] angkaArray = {1, 2, 3, 4, 5};

        
        System.out.print("Isi array: ");
        for (int i = 0; i < angkaArray.length; i++) {
            System.out.print(angkaArray[i] + " ");
        }
        System.out.println();

        
        int jumlah = 0;
        for (int angka : angkaArray) {
            jumlah += angka;
        }
        System.out.println("Jumlah elemen array: " + jumlah);

        
        gandakanNilai(angkaArray);
        
        System.out.print("Isi array setelah diubah: ");
        for (int angka : angkaArray) {
            System.out.print(angka + " ");
        }
    }
    
    static void gandakanNilai(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
    
    }
    
}
