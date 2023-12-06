package Day59;

public class Day59 {
    
    public static void main(String[] args) {
        int[][] angka = {
            {40,45,23},
            {17,38,41},
            {9,11,56}
        };
        for(int i = 0; i < angka.length; i++){
            for( int j = 0; j <angka[i].length; j++){
                System.out.print(angka[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
