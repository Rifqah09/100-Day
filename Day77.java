package Day77;

import java.util.Arrays;

public class Day77 {
    
    public static void main(String[] args) {
        String[] kabupaten = {"Polewali Mandar","Mamuju","Mamasa","Majene","Mamuju tengah","Pasangkayu"};
        Arrays.sort(kabupaten);
        int i = 0;
        while(i < kabupaten.length){
            System.out.println(kabupaten[i]);
            i++;
        }
    }
    
}
