public class Main{

    public static void main(String[] args) {

        int switchValue = 4;
        switch(switchValue){
            case 1:
                System.out.println("Switch 1");
                break;
            case 2:
                System.out.println("Switch 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was a 3 , a 4 , a5 ");
                System.out.println("actually it was a " + switchValue);
                break;
            default:
                System.out.println("That was not 1 or 2");
                break;
        }

        String natoPhoneticAlphabet = "";
        switch(natoPhoneticAlphabet){
            case "A":
                System.out.println("Able");
                break;
            case "B":
                System.out.println("Baker");
                break;
            case "C":
                System.out.println("Charlie");
                break;
            case "D":
                System.out.println("Dog");
                break;
            case "E":
                System.out.println("Easy");
                break;
            default:
                System.out.println("not found");
        }

        printDayOfWeek(4);
    }

    public static String getQuarter(String month){
        return switch (month) {
            case "JANUARY", "February", "March" -> "1st";
            case "April", "May", "June" -> "2nd";
            case "July", "August", "September" -> "3rd";
            case "OCTOBER", "November", "Dezember" -> "4th";
            default -> "bad";
        };
    }

    public static void printDayOfWeek(int day){
        String dayOfWeek =  switch (day){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };

        System.out.println(day + " stands for " + dayOfWeek);
    }
}
