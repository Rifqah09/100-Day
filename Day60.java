package Day60;


public class Day60 {
    
    public static void main(String[] args) {
        String[][] namaTeman = {
            {"Avika","Lisa","Dina"},
            {"Greis","Ria","Cinta"},
            {"Mawaddah","Livia","Tika"}
        };
        for(int i = 0; i < namaTeman.length; i++){
            for( int j = 0; j <namaTeman[i].length; j++){
                System.out.print(namaTeman[i][j]+" ");
            }
            System.out.println();
    }

    }
}
