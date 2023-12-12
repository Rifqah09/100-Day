package Day65;

public class Day65 {
    
    public static void main(String[] args) {
        int[][] angka = new int [2][3];
        for(int i = 0; i < angka.length; i++){
            for( int j = 0; j < angka[i].length; j++){
                angka[i][j] = (int)(Math.random() * 25);
                
            }
        }
        System.out.println("Angka Random : ");
        
        for(int i = 0; i < angka.length; i++){
            for(int j = 0; j < angka[i].length; j++){
                System.out.print(angka[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
