package Day78;

public class Day78 {
    
    public static void main(String[] args) {
        
        int[] angka = {20, 34, 21, 87, 92, 16};
        
        int cari = 87;
        boolean ditemukan = false;
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] == cari) {
                ditemukan = true;
                break;
            }
        }
        
        if (ditemukan) {
            System.out.println("Angka " + cari + " ditemukan dalam array.");
        } else {
            System.out.println("Angka " + cari + " tidak ditemukan dalam array.");
        }
    
    }
}
