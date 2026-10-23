public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(1,0,5));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if (bigCount < 0 || goal < 0 ){
            return false;
        }
        bigCount = bigCount*5;
        int resgoal = goal % 5;
        if ((bigCount + smallCount) >= goal){
            if (resgoal == 0 || (resgoal <= smallCount) || bigCount + smallCount == goal ){
                return true;
            }
        }
        return false;


    }
}
