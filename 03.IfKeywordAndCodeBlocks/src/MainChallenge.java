public class MainChallenge {

    public static void main(String[] args) {

  /*      boolean gameover = true ;
        int score = 1;
        int levelCompleted = 1;
        int bonus = 1;

        int finalScore = score;*/
        boolean gameOver = true ;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver ,score,  levelCompleted , bonus);
        System.out.println("The highScore is " + highScore);
        calculateScore(true ,10000 , 8 , 200);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        System.out.println("yo" + calculateScore(gameOver ,score,  levelCompleted , bonus));



        if (isTooYoung(20)) {
            System.out.println("20TooYoung");
        }else{
            System.out.println("20TooOld");
        }
        if (isTooYoung(17)) {
            System.out.println("17TooYoung");
        }

    }

    public static int calculateScore(boolean gameover ,int score ,  int levelCompleted , int bonus){

      /*  boolean gameover = true ;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;
      */

        int finalScore = score;

        if (gameover){
            finalScore += (levelCompleted*bonus);
            finalScore += 1000;
        }
        return finalScore;
    }

    public static boolean isTooYoung(int age){
        boolean result = false;
        if (age < 18){
            result = true;
        }
        return result;
    }


}
