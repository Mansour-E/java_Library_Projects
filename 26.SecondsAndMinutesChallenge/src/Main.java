public class Main {

    public static void main(String[] args) {

        System.out.println("3665s is : " + getDurationString(3665));
        System.out.println("61 minutes and 5 seconds is : " + getDurationString(61,5));

    }

    public static String getDurationString(int seconds){

        if(seconds < 0){
            return "Invalid data for second (" + seconds + "), please try again";
        }
        int minutes = seconds / 60;
        int hours = minutes / 60;
        seconds = seconds % 60;
        minutes = minutes % 60;


        return hours+ "h " + minutes + "m " + seconds + "s'";
    }

    public static String getDurationString(int minutes, int seconds){
        if(minutes < 0){
            return "Invalid data for minutes (" + minutes + "), please try again";
        }
        if(seconds < 0 || seconds > 59){
            return "Invalid data for second (" + seconds + "), seconds must be between 0 and 59";
        }
        seconds = (minutes * 60 ) + seconds;
        return getDurationString(seconds);
    }
}
