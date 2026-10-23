public class Main {
    public static void main(String[] args) {

        int first = 12;
        int second = 30;

        int t = getGreatestCommonDivisor(first, second);
        System.out.println(t);

    }

    public static int getGreatestCommonDivisor(int first, int second){
        if ( first < 10 || second < 10){
            return -1;
        }
        int result = 0;
        if (first > second ) {
            for (int i = 1; i < first; i++) {
                if (first % i == 0 && second % i == 0) {
                    result = i;
                }

            }
        }

        if (second > first) {
            for (int i = 1; i < second; i++) {
                if (second % i == 0 && first % i == 0) {
                    result = i;
                }
            }
        }
        return result;
    }
}
