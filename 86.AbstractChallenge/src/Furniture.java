public class Furniture extends ProductForSale{


    public Furniture(String type, double price, String description) {
        super(type, price, description);


    }

    @Override
    public void showDetails() {

        System.out.println("This " + " was manufactured in North Carolina");

    }
}
