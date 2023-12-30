package Day83;

public class Day83 {
    
    public static void main(String[] args) {
        
        double[][] cuaca = new double[2][12];

        
        for (int tahun = 0; tahun < 2; tahun++) {
            for (int bulan = 0; bulan < 12; bulan++) {
                cuaca[tahun][bulan] = 28.0;
            }
        }

        
        for (int tahun = 0; tahun < 2; tahun++) {
            for (int bulan = 0; bulan < 12; bulan++) {
                System.out.println("Cuaca rata-rata pada tahun " + (tahun + 2022) + ", bulan " + (bulan + 1) + ": " + cuaca[tahun][bulan]);
            }
        }
   
    }
    
                                   }
