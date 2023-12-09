package Day62;
import java.util.Arrays;

public class Day62 {
    
    public static void main(String[] args) {
        int[] nomor = {10,6,3,1, 2, 4, 5 , 9 , 8 ,7};
        String[] nama = {"Gandi","Avika","Zuhdi","Ria","Naufal","Greis","Rehan","Hikma","Ikhsan","Cinta"};
            for(int i=0 ; i< 10 ; i++){
            Arrays.sort(nomor);
            Arrays.sort(nama);
            System.out.println(nomor[i]+" "+nama[i]);
        
    }
    
    }
}
