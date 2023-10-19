package bigDecimal;

import java.math.BigDecimal;
public class BigDecimal {


    public static void main(String[] args) {
        BigDecimal no1 = new BigDecimal("11.4");
        BigDecimal no2 = new BigDecimal("3.4");

        //Penjumlahan
        BigDecimal additionResult = no1.add(no2);
        System.out.println("Penjumlahan : " + addtitionResult);

        //Pengurangan
        BigDecimal subtractionResult = no1.substract(no2);
        System.out.println("Pengurangan : " + substractionResult);

        //Perkalian 
        BigDecimal muliplicationResult = no1.multiply(no2);
        System.out.println("Perkalian : " + multiplicationResult);

        //Pembagian (dengan pembulatan)
        BigDecimal divisionResult = no1.divide(no2, 2, BigDecimal.ROUND_HALF_UP);
        System.out.println("Pembagian : " + divisionResult);

    }

}
