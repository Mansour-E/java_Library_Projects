import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int min = 1000000000;
        int max = 0;
        int loopCount = 0;
        while(true){

            try {
                System.out.print("Enter next number: ");
                String number = scanner.nextLine();
                int num = Integer.parseInt(number);
                if (num < min){
                    min = num;
                }
                if (num > max){
                    max = num;
                }
                loopCount++;
            }catch(NumberFormatException e){
                break;
            }

        }
        if(loopCount > 0){
            System.out.println("The Minimum number is " + min + " and Maximum Number is " + max );
        } else {
            System.out.println("No numbers entered");
        }


    }
}
