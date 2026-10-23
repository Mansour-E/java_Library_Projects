public class Main {

    public static void main(String[] args) {
        System.out.println("0 is " + (isPrime(0) ? "":"NOT") + "a prime number");
        int count = 0;
        for (int i = 1 ; count < 3 && i <= 1000; i++){
            if(isPrime(i)){
                System.out.println(i);
                count ++;
            }

        }
        System.out.println("We have " + count + " prime numbers");
    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2){
            return (wholeNumber == 2);
        }

        for(int divisor = 2; divisor < wholeNumber; divisor++){
            if(wholeNumber % divisor == 0){
                return false;
            }
        }
        return true;
    }
}
