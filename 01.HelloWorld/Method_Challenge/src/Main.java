public class Main {

    public static void main(String[] args) {
        int score = 600;
        String name = "Time";
        int position = calculateHighScorePosition(score);
        displayHighScorePosition(name , position);

        position = calculateHighScorePosition(1000);
        displayHighScorePosition("Bob" , position);

        position = calculateHighScorePosition(500);
        displayHighScorePosition("alice" , position);

        position = calculateHighScorePosition(100);
        displayHighScorePosition("judi" , position);

        position = calculateHighScorePosition(25);
        displayHighScorePosition("jalali" , position);

    }

    public static void displayHighScorePosition(String playerName ,int position){
        System.out.println(playerName + " managed to get into position " + position + " on the high score list");
    }

    public static int calculateHighScorePosition(int score){
        int position = 0;

        if (score >= 1000){
            position = 1;
        }else if (score >= 500 && score < 1000){
            position = 2;
        }else if (score >= 100 && score < 500){
            position = 3;
        }else{
            position = 4;
        }

        return position;
    }
}
