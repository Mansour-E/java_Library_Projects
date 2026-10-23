import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int sum = 0;

        while ( counter <= 5){
            System.out.println("Enter number #" + counter + ":");
            String nextNumber = scanner.nextLine();
            try{
                int number = Integer.parseInt(nextNumber);
                counter++;
                sum += number;
            }catch (NumberFormatException e ){
                System.out.println("Invalid number");

            }
        }
    }
}
