public class Main{

    public static void main(String[] args) {
        int number = 3;
        int result = sumDigits(number);
        System.out.println(result);

    }

    public static int sumDigits(int number){

        if (number < 0){
            return -1;
        }
        int result = 0;
        while (number > 0){
            result = result + (number % 10);
            number /= 10;
        }
        return result;


    }
}
