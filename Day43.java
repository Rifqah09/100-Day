package Day43;

public class Day43 {
    
    public static void main(String[] args) {
         int a,b,c,d;
        for (a = 1; a <=5; a++) {
            
            for ( b = 4; b >= a; b--) {
                System.out.print(" ");
                
            }
            
            for ( c = 1; c <=a; c++) {
                System.out.print("*");
                
            }
            for ( d = 1; d <= a-1; d++) {
                System.out.print("*");  
                
            }
            System.out.println();
            
        }
}

        
    
    

    }

              
