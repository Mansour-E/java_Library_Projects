public class Item{

    private String name;
    private double price;
    private String type;
    private String size = "MEDIUM";

    public Item(String type , String name , double price){
        this.name = name.toUpperCase();
        this.price = price;
        this.type = type.toUpperCase();
    }
    public String getSize(){ // just for test
        return size;
    }
    public String getType(){// just for test
        return type;
    }
    public String getName(){
        if(type.equals("DRINK") || type.equals("SIDE")){
            return size + " " + name;
        }
        return name;
    }

    public void setSize(String size){
        this.size = size.toUpperCase();
    }

    public double getBasePrice(){
        return price;
    }

    public double getAdjustedPrice(){
        return switch(size){
            case "SMALL" -> getBasePrice() - 0.5;
            case "LARGE" -> getBasePrice() + 1;
            default -> getBasePrice();
        };
    }
    public static void printItem(String name, double price){
        System.out.printf("%20s:%6.2f%n" , name , price);
    }
    public void printItem(){
        printItem(getName() , getAdjustedPrice());
    }


}