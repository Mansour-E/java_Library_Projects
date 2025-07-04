public class Main {
    public static void main(String[] args) {

        System.out.println("12 inches is : " + convertToCentimeters(12));
        System.out.println("12 feet and 5 inches is : " + convertToCentimeters(12 , 5));

    }

    public static double convertToCentimeters(int hightInInches){
        return (double)hightInInches * 2.54d;
    }

    public static double convertToCentimeters(int hightInFeet , int hightInInches){
        int inches = hightInFeet * 12 + hightInInches;
        return convertToCentimeters(inches);
    }
}
