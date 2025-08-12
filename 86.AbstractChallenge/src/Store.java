import java.util.ArrayList;

record OrderItem(int quantity, ProductForSale product) {

}
public class Store {

    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

    public static void main(String[] args) {

        storeProducts.add(new ArtObject("Oil Painting", 1350, "Impressionistic work by ABF painted in 2010"));
        storeProducts.add(new ArtObject("Sculpture", 2000, "Bronze work by JKF, product in 1950"));

        listProduct();

    }

    public static void listProduct(){

        for (var item : storeProducts){

            System.out.println("-".repeat(30));
            item.showDetails();

        }
    }
}
