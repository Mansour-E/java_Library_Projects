public class SmartKitchen {

    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen(){

        brewMaster = new CoffeeMaker();
        dishWasher = new DishWasher();
        iceBox = new Refrigerator();

    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void setKitchenState(boolean coffeeFlag , boolean fridgeFlag , boolean dishWasherFlag){
        brewMaster.setHastWorkToDo(coffeeFlag);
        iceBox.setHastWorkToDo(fridgeFlag);
        dishWasher.setHastWorkToDo(dishWasherFlag);
    }

    public void doKitchenWork(){

        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();

    }
}

class CoffeeMaker {

    private boolean hastWorkToDo;

    public void setHastWorkToDo(boolean hastWorkToDo) {
        this.hastWorkToDo = hastWorkToDo;
    }

    public void brewCoffee(){
        if (hastWorkToDo) {
            System.out.println("Brewing Coffee");
            hastWorkToDo = false;
        }
    }
}
class DishWasher {

    private boolean hastWorkToDo;

    public void setHastWorkToDo(boolean hastWorkToDo) {
        this.hastWorkToDo = hastWorkToDo;
    }

    public void doDishes(){

        if(hastWorkToDo){
            System.out.println("Washing the dishes");
            hastWorkToDo = false;
        }

    }

}
class Refrigerator {

    private boolean hastWorkToDo;


    public void setHastWorkToDo(boolean hastWorkToDo) {
        this.hastWorkToDo = hastWorkToDo;
    }

    public void orderFood(){

        if(hastWorkToDo){
            System.out.println("Ordering Food");
            hastWorkToDo = false;
        }

    }


}