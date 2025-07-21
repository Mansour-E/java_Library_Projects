public class Main {

    public static void main(String[] args) {

        Item coke = new Item("drink" , "coke" , 1.50);
        coke.printItem();
        coke.setSize("large");
        coke.printItem();
        System.out.println(coke.getType()); // test the functions

        Item salat = new Item("salat" , "salat" , 1);

        salat.printItem();
        salat.setSize("large");
        salat.printItem();

        salat.getSize();//test the UPPERCASE function

        Item avocado = new Item("Topping" , "avocado" , 1.50);
        avocado.printItem();
    }
}
