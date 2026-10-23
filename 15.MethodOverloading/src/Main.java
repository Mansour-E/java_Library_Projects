public class Main {

    public static void main(String[] args) {
        System.out.println("6 feet ist " + convertToCentimeters(6 , 0));

        System.out.println("12 inches ist " + convertToCentimeters(12));

    }

    public static double convertToCentimeters(int hightinInches){
        return (double)(hightinInches * 2.54d);
    }

    public static double convertToCentimeters(int hightInFeet , int hightInInches){
        int inches = (hightInFeet * 12 ) + hightInInches;
        return convertToCentimeters(inches);
    }


}
