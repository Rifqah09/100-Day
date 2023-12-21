package Day74;

public class Day74 {
    
    public static void main(String[] args) {
        int [][] angka = {
            {12,-17,5,71,-9,-50},
            {81,67,35,-32}
        };
        int i = 0;
        do{
            int j = 0;
            do{
                System.out.print(angka[i][j]+" ");
                j++;
            }while(j < angka[i].length);
            System.out.println();
            i++;
        }while(i < angka.length);
    }
    
               }
