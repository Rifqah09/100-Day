package day100;

public class Day100 {
    
    public static void main(String[] args) {
            int size = 7;

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size || i == size / 2 + 1 || (i <= size / 2 && j == 1) || (i > size / 2 && j == size)) {
                    System.out.print("S ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    
    }
    
}
