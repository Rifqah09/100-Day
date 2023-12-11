package Day64;

public class Day64 {
    
    public static void main(String[] args) {
        int[][] array1 = {{10, 20, 30},
                          {40, 50, 60},
                          {70, 80, 90}};

        int[][] array2 = {{2, 2, 2},
                          {5, 5, 5},
                          {10, 10, 10}};

        
        double[][] hasil = new double[array1.length][array2[0].length];

        
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2[0].length; j++) {
                hasil[i][j] = (double) array1[i][j] / array2[i][j];
            }
        }

        
        for (int i = 0; i < hasil.length; i++) {
            for (int j = 0; j < hasil[0].length; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
    


    }
    
                               }
