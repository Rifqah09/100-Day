package Day84;

public class Day84 {
    
    public static void main(String[] args) {
        
        String[] menuMakanan = new String[5];
        menuMakanan[0] = "Nasi Goreng";
        menuMakanan[1] = "Mie Ayam";
        menuMakanan[2] = "Sate Ayam";
        menuMakanan[3] = "Gado-gado";
        menuMakanan[4] = "Soto Ayam";

        System.out.println("Menu Makanan:");
        for (int i = 0; i < menuMakanan.length; i++) {
            System.out.println((i + 1) + ". " + menuMakanan[i]);
        }
    
    }
    
}
