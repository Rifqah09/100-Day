package Day81;

public class Day81 {
    
    public static void main(String[] args) {
        
        double[][] nilaiMahasiswa = {
            {80.5, 70.2, 85.7},
            {90.3, 85.6, 78.9},
            {75.8, 82.4, 88.1}
        };

       
        double[] rataNilai = new double[3];
        for (int i = 0; i < 3; i++) {
            double total = 0;
            for (int j = 0; j < 3; j++) {
                total += nilaiMahasiswa[j][i];
            }
            rataNilai[i] = total / 3;
        }

      
        System.out.println("Rata-rata nilai dalam setiap mata kuliah:");
        System.out.println("Mata Kuliah 1: " + rataNilai[0]);
        System.out.println("Mata Kuliah 2: " + rataNilai[1]);
        System.out.println("Mata Kuliah 3: " + rataNilai[2]);
  
    }
    
}
