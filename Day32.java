package Day32;

public class Day32 {
    
    public static void main(String[] args) {
        String pesan = "Error!!";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println(pesan);
        }
    }
    
}
