public class Main {

    public static void main(String[] args) {


        int number = 5;
        boolean flag = true;
        int totalEven = 0;
        int totalOdd = 0;

        while (flag) {

            if(!isEvenNumber(number)){
                totalOdd += number;
                number ++;
                continue;
            }
            totalEven += number;
            System.out.println(number);
            number ++;
            if ( number == 21){
                flag = false;
            }
        }
        System.out.println("The total Even number is : "  + totalEven);
        System.out.println("The total Odd Number is : " + totalOdd);
        number = 5;
        flag = true;
        System.out.println("Mode 2 : \n");

        do{
            if(!isEvenNumber(number)){
                number ++;
                continue;
            }
            System.out.println(number);
            number++;
            if ( number == 21){
                break;
            }
        }while(flag);

    }

    public static boolean isEvenNumber(int number){
        if(number % 2 == 0){
            return true;
        }
        return false;
    }


}
