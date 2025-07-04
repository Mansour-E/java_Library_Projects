public class Main {

    public static void main(String[] args) {

        System.out.println(getLargestPrime(105));
    }

    public static int getLargestPrime(int number){

        if (number <= 0){
            return -1;
        }
        if (number == 1){
            return -1;
        }
        int result = 0;
        boolean isPrime = true;
        for (int i = 2; i <= number; i++){
            if (number % i == 0){
                isPrime = true;
                for (int j = 2; j < i; j++){
                    if (i % j == 0){
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime){
                    result = i;
                }

            }
        }
        return result;
    }

    public static boolean isPrime(int number){
        if (number < 2){
            return false;
        }
        for (int i = 2; i < number; i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
