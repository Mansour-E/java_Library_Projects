package info.emami;

public class Main {

    public static void main(String[] args) {

        Integer five = 5;
        Integer[] other = {0, 5, 10, -50, 50};

        for (Integer i : other){
            int val = five.compareTo(i);
            System.out.printf("%d %S %d: compareTo=%d%n",five,
                    (val == 0 ? "==" : (val < 0) ? "<" : ">"), i ,val);

        }


    }


}
