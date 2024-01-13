package day98;

public class Day98 {
    
    public static void main(String[] args) {
        
      
        int waktuAwal = 37255;
        
        int waktuAkhir = 44730;
        
        int selisihDetik = waktuAkhir - waktuAwal;
        
        int jam = selisihDetik / 3600;
        int sisaDetik = selisihDetik % 3600;
        int menit = sisaDetik / 60;
        int detik = sisaDetik % 60;

        System.out.println("Selisih waktu: " + jam + " jam " + menit + " menit " + detik + " detik");
    
        
    }
    
}
