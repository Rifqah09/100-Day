package Day66;

public class Day66 {
    
    public static void main(String[] args) {
        
        int[] array = { 1, 2, -3, 4, -5, 6, -7, -8, -9, 10 };

        System.out.println("Bilangan positif:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                System.out.println(array[i]);
            }
        }

        System.out.println("Bilangan negatif:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                System.out.println(array[i]);
            }
  
    }
    }
}
        
