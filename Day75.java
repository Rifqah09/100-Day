package Day75;

public class Day75 {
    
    public static void main(String[] args) {
        int[] angka = {20, 30, 25, 35, 20, 60, -100};

        System.out.println("Elemen yang sama dalam array adalah :");

        for(int i=0; i<angka.length; i++) {
           for(int j=i+1; j<angka.length; j++) {
              if(angka[i] == angka[j]) {
              System.out.println(angka[j]);
        }
      }
    }

    }
    
                                 }
