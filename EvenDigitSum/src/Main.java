public class Main {

    public static void main(String[] args) {

        int number = 123456789;
        System.out.println(getEvenDigitSum(number));

    }

    public static int getEvenDigitSum(int number){

        if (number < 0){
            return -1;
        }

        int sum = 0;
        int result = 0;
        while(number > 0){
            result = number % 10;
            if (result % 2 == 0){
                sum += result;
            }
            number /= 10;


        }
        return sum;
    }
}
