package Day42;

public class Day42 {
    
    public static void main(String[] args) {
        int total = 0; int b = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 3; j++) {
                b=i+j;
                total = total + b;
                
            }
        }
        System.out.println(total);
}
        
    
    

    }

