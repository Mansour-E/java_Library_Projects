import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    int currentYear = 2022;
    String usersDateOfBirth = "1999";

    int dateOfBirth = Integer.parseInt(usersDateOfBirth);

    System.out.println("age = " + (currentYear - dateOfBirth));

    try {
        System.out.println(getInputFromConsole(currentYear));
    }catch (NullPointerException e){
        System.out.println(getInputFromScanner(currentYear));
    }

    }

    public static String getInputFromConsole(int currentYear){
        String name = System.console().readLine("Hi what is your name?");
        System.out.println("Hi " + name + ", Thank you for taking a course!");
        return "";
    }

    public static String getInputFromScanner(int currentYear){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("Hi " + name + ", Thank you for taking a course!");

        System.out.println("what year were you born? ");

        boolean validdob = false ;
        int age = 0;
        do {
            System.out.println("Enter a year of birth >= " + (currentYear - 125) + " and <= " + currentYear);
            try {
                age = checkData(currentYear , scanner.nextLine());
                validdob = age < 0 ? false : true;
            }catch (NumberFormatException e){
                System.out.println("Characters not allowed!!! Try again.");
            }
        }while(!validdob);

        String year = scanner.nextLine();
        int age1 = currentYear - Integer.parseInt(year);

        System.out.println("So you are " + age1 + " years old. ");

        return "";
    }

    public static int checkData(int currentYear , String dateOfBirth){
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if ((dob < minimumYear) || (dob > currentYear)){
            return -1;
        }

        return (currentYear - dob);
    }


}
