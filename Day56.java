package Day5

public class day56 {
    
    public static void main(String[] args) {
        String[] judulNovel = {"Laskar pelangi","Bumi manusia","Perahu kertas","Laut bercerita"};
        int[] tahunTerbit = {2005,1980,2009,2013};
        System.out.println("Daftar Novel: ");
        for(int i =0; i < judulNovel.length; i++){
            System.out.println((i + 1) + ". " + judulNovel[i] + " - Tahun Terbit: " + tahunTerbit[i]);
        }
    
    }
}
