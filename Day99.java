  package day99;

public class Day99 {
    
    public static void main(String[] args) {
        
        String kalimat = "Halo, nama saya Rifqah";
        String kataYangDicari = "saya";

        String[] kata = kalimat.split(" ");

        int indeks = -1;

        for (int i = 0; i < kata.length; i++) {
            if (kata[i].equalsIgnoreCase(kataYangDicari)) {
                indeks = i;
                break;
            }
        }

        if (indeks != -1) {
            System.out.println("Kata '" + kataYangDicari + "' ditemukan pada indeks " + indeks);
        } else {
            System.out.println("Kata '" + kataYangDicari + "' tidak ditemukan dalam kalimat");
        }
   
    }
    
        }
