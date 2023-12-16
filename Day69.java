package Day69;

public class day69 {
    
    public static void main(String[] args) {
        String[][] makanan = {{"Bakso","Nasgor","Pangsit"},
            {"Buras","Ketupat","gogos"}};
        System.out.println(makanan[1][2]);
        
        for(String[] makananWarung : makanan){
            for (String makan : makananWarung){
                System.out.print(makan + " ");
                
            }
            System.out.println();
        }
    }
    
}
