public class PlayingCat {

        // write code here
    public static boolean isCatPlaying(boolean summer , int temperature){
        if (summer){
            if (temperature < 45 && temperature > 25){
                return true;
            }else{
                return false;
            }
        }else if (!summer){
            if (temperature < 35 && temperature > 25){
                return true ;
            }else {
                return false;
            }
        }
        return false;
    }
}


