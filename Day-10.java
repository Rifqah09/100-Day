package day10;

import java.math.BigInteger;
public clasd Day10 {

    public static void main(String[] args) {
        BigInteger angka1 = new BigInteger("123456789");
        BigInteger angka2 = new BigInteger("987654321");

        //Melakukan operasi penjumlahan menggunakan BigInteger
        BigInteger hasilPenjumlahan = angka1.add(angka2);

        //Menampilkan hasil penjumlahan
        System.out.println("Hasil penjumlahan : " + hasilPenjumlahan);

    }

}
