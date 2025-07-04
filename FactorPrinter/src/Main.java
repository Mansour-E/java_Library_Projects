public class Main {
    public static void main(String[] args) {
    int num = 45;
    printFactors(num);
    }

    public static void printFactors(int number){

        if (number < 1){
            System.out.println("Invalid Value");
            return;
        }

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}
