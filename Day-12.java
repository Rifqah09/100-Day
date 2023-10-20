package konversistringketipedata;

public KonversiStringKeTipeData {


    public static void main(String[] args) {
        String intString = "18";
        String byteString = "09";
        String longString = "987654321";
        String doubleString = "75.5";
        String shortString = "2023";
        String floatString = "3.0f";
        String charString = "R";
        String booleanString = "false";

        int intValue = Integer.parseInt(intString);
        byte byteValue = Byte.parseByte(byteString);
        long longValue = Long.parseLong(longString);
        double doubleValue = Double.parseDouble(doubleString);
        short shortValue = Short.parseShort(shortString);
        float floatValue = Float.parseFloat(floatString);
        char charValue = Char.parseChar(charString);
        boolean booleanValue = BooleanChar(booleanString);

        System.out.println("String ke int : " + intValue);
        System.out.println("String ke byte : " + byteValue);
        System.out.println("String ke long : " + longValue);
        System.out.println("String ke double : " + doubleValue);
        System.out.println("String ke short : " + shortValue);
        System.out.println("String ke float : " + floatValue);
        System.out.println("String ke char : " + charValue);
        System.out.println("String ke boolean : " + booleanValue);


    }

}
