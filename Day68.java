package Day68;

public class Day68 {
    
    public static void main(String[] args) {
        
        int[] angkaArray = {3, 7, 1, 5, 9, 11, 22};

        
        System.out.println("Elemen-elemen array yang lebih besar dari 7: ");
        int i = 0;
        while (i < angkaArray.length) {
            if (angkaArray[i] > 7) {
                System.out.println(angkaArray[i]);
            }
            i++;
        }
    }
}
        
    

    

