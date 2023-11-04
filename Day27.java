package day27;
public class Day27 {
  public static void main(String[] args) {
    //Terdapat tiga buah keranjang di rumah. Salah satu keranjang kosong dan sisanya terisi buah. 
    //Apabila salah satu keranjang dibawa, berapa buah yang terdapat di rumah? conth1:
    //keranjang1=kosong keranjang2=10 keranjang3=5 keranjang 1 dibawa

    //Jumlah buah dalam masing-masing keranjang
    int keranjang1 = 0; //Keranjang pertama kosong
    int keranjang2 = 10;
    int keranjang3 = 5;

    //Jika salah satu keranjang dibawa,maka jumlah buah di rumah adalah jumlah buah dalam dua keranjang lainnya
    int jumlahBuahDiRumah = keranjang2 + keranjang3;

    System.out.println("Jumlah buah dirumah: " + jumlahBuahDiRumah);


  }
}
    
