package Day85;

public class Day85 {
    
    public static void main(String[] args) {
        
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 6, 4, 5};

        
        if(array1.length != array2.length) {
            System.out.println("Dua array tersebut tidak sama.");
        } else {
            
            boolean isEqual = true;
            for(int i=0; i<array1.length; i++) {
                if(array1[i] != array2[i]) {
                    isEqual = false;
                    break;
                }
            }

            
            if(isEqual) {
                System.out.println("Dua array tersebut sama.");
            } else {
                System.out.println("Dua array tersebut tidak sama.");
            }
        }
    
    }
    
}
