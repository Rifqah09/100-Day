package Day86;

public class Day86 {
    
    public static void main(String[] args) {
        
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 6) {
                index = i;
                break;
            }
        }

        
        if (index != -1) {
            System.out.println("Nilai 6 ditemukan pada indeks ke-" + index);
        } else {
            System.out.println("Nilai 6 tidak ditemukan dalam array");
        }
    
        
    
    }
}
    
