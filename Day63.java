package Day63;

public class Day63 {
    
    public static void main(String[] args) {
               int [][] data = {
                   {22, 24, 19},
                   {12, 66, 54},
                   {37, 82, 92}
        };
              int jumlah = 0;
              for (int i = 0; i < data.length; i++) {
                  for (int j = 0; j < data[i].length; j++) {
                  jumlah+= data[i][j];

            }
        }System.out.println("Jumlah seluruh data adalah " + jumlah);
    }
    
}
