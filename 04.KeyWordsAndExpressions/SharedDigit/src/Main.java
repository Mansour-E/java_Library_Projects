public class Main {

    public static void main(String[] args) {

        int num1 = 23;
        int num2 = 52;
        System.out.println(hasSharedDigit(num1, num2));

    }

    public static boolean hasSharedDigit(int num1 , int num2) {
        if (num1 >= 10 && num1 <= 99 && num2 >= 10 && num2 <= 99 ){
            while(num1 != 0 && num2 != 0) {

                int resultnum11 = num1 % 10;
                num1 = num1 / 10;
                int resultnum12 = num1 % 10;
                num1 = num1 / 10;
                int resultnum21 = num2 % 10;
                num2 = num2 / 10;
                int resultnum22 = num2 % 10;
                if (resultnum11 == resultnum21 || resultnum11 == resultnum22 || resultnum12 == resultnum21 || resultnum12 == resultnum22){
                    return true;
                }

            }
            return false;

        }
        return false;
    }
}
