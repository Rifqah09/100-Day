package day92;

public class Day92 {
    
    public static void main(String[] args) {
        int hargaKomputer = 55000000;
        int tabunganPerBulan = 1500000;
        int bulan = 0;

        while (hargaKomputer > 0) {
            hargaKomputer -= tabunganPerBulan;
            bulan++;
        }

        System.out.println("Dilan perlu menabung selama " + bulan + " bulan untuk membeli komputer sultan.");
    
    }
    
} 
