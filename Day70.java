package Day70;

public class Day70 {
    
    public static void main(String[] args) {
        boolean[] kehadiranMahasiswa = {true, false, false, true, false, true};

        
        System.out.println("Mahasiswa yg hadir : ");

        for (int i = 0; i < kehadiranMahasiswa.length; i++) {
            System.out.println("Mahasiswa " + (i + 1) + ": " + (kehadiranMahasiswa[i] ? "Hadir" : "Tidak Hadir"));
    }
    }
}

