package Day67;

public class Day67 {
    
    public static void main(String[] args) {
        int[] nilaiMahasiswa = {85, 90, 78, 88, 92};

        
        int batas = 80;
        int jumlahNilaiDiAtasBatas = 0;

        
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            if (nilaiMahasiswa[i] > batas) {
                jumlahNilaiDiAtasBatas++;
            }
        }

        System.out.println("Jumlah nilai di atas " + batas + ": " + jumlahNilaiDiAtasBatas);
    
        
    }

    }

