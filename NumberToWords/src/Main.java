public class Main {

    public static void main(String[] args) {

    /*System.out.println(reverse(12300));*/

    /*System.out.println(getDigitCount(100) - getDigitCount(reverse(100)));*/
    numberToWords(10);

    }

    public static void numberToWords(int number) {

        int num = 0;
        String str = "";
        if (number < 0 ){
            System.out.println("Invalid Value");
        }



        int reverse = reverse(number);
        while ( reverse > 0 ){
            num = reverse % 10;
            reverse /= 10;
            switch (num){
                case 0: str = str + "Zero"; break;
                case 1: str = str + "One"; break;
                case 2: str = str + "Two"; break;
                case 3: str = str + "Three"; break;
                case 4: str = str + "Four"; break;
                case 5: str = str + "Five"; break;
                case 6: str = str + "Six"; break;
                case 7: str = str + "Seven"; break;
                case 8: str = str + "Eight"; break;
                case 9: str = str + "Nine"; break;
                default: str = str + " " ; break;

            }
            if ( reverse > 0){
                str = str + " ";
            }

        }

        int dif = getDigitCount(number) - getDigitCount(reverse(number));
        if (dif > 0){
            for (int i = 0 ; i < dif ; i++){
                str = str + " Zero";
            }
        }
        if(number == 0){
            System.out.println("Zero");
        }
        System.out.println(str);
    }

    public static int reverse(int number){
        int reverse = 0;
        int count = 0;
        while ( number != 0 ){
            reverse = reverse + (number % 10);

            if(reverse == 0){
                count ++;
            }

            number /= 10;
            if (number !=0){
                reverse = reverse*10;
            }

        }

        return reverse;
    }

    public static int getDigitCount(int number){
        if ( number < 0 ){
            return -1;
        }

        if ( number == 0 ){
            return 1;
        }


        int reverse = 0;
        int digitCount = 0;
       while ( number > 0 ){
           reverse = reverse + (number % 10);
           number /= 10;
           digitCount++;
       }
       return digitCount;
    }
}
