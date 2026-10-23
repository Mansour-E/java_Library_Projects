public class Main {

    public static void main(String[] args) {

        int number = 1234321;
        System.out.println("result is " + isPalindrome(number));


    }

    public static boolean isPalindrome(int number){

        int reverse = 0;
        int number1 = number;

        while(number1 != 0){
            reverse = reverse + (number1 % 10);
            number1 /= 10;
            if (number1 != 0){
                reverse = reverse*10;
            }


        }
        return number == reverse;

    }
}
