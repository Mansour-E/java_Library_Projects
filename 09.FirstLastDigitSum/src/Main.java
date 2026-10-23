public class Main {

    public static void main(String[] args) {

        int num1 = 1234;
        System.out.println(sumFirstAndLastDigit(num1));
        
    }
    public static int sumFirstAndLastDigit(int number){

        if (number < 0){
            return -1;
        }
        
        int sum = 0;
        int reverse = 0;
        int number1 = number;
        while(number1 != 0){
            reverse = reverse + number1 % 10;
            number1 = number1 / 10;
            if (number1 != 0){
                reverse = reverse * 10 ;
            }
        }
        sum = (reverse %10) + (number%10);
        return sum;

    }
}
