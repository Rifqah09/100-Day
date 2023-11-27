package Day50;

public class Day50 {
    
    public static void main(String[] args) {
        int[] nilaiMhs= new int[4];
        nilaiMhs [0] = 75;
        nilaiMhs [1] = 80;
        nilaiMhs [2] = 85;
        nilaiMhs [3] = 90;
        
        double ratarata = 0.0;
        for(int i = 0; i< nilaiMhs.length; i++){
            ratarata+=nilaiMhs[i];
            
        }
        ratarata/=nilaiMhs.length;
        System.out.println("Nilai rata-rata : " + ratarata);
        System.out.println("Nilai rata-rata : " + Math.ceil(ratarata));
    }
    
                           }
