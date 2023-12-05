package Day58;

public class Day58 {
    
    public static void main(String[] args) {
        int[][] data = {{24, 31, 68},
                        {55, 83, 0},
                        {45, 77, 23}};

        // Cari nilai tertinggi dan terendah
        int nilaiTertinggi = Integer.MIN_VALUE;
        int nilaiTerendah = Integer.MAX_VALUE;

        for (int[] baris : data) {
            for (int nilai : baris) {
                if (nilai > nilaiTertinggi) {
                    nilaiTertinggi = nilai;
                }
                if (nilai < nilaiTerendah) {
                    nilaiTerendah = nilai;
                }
            }
        }

        
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
    }



    }
    
