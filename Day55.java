package Day55;

public class Day55 {
    
    public static void main(String[] args) {
        System.out.println("~~~Menjumlahkan isi array~~~");

        int angka [] = new int [] {11,4,9,59,19};

        int jumlah = 0;

        for (int i = 0; i < angka.length; i++) {
            jumlah += angka[i];
        }
        System.out.println(jumlah);
        
    }
    
}
