public class SmartKitchen {

    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;



}

class CoffeeMaker {

    private boolean hastWorkToDo;

    public CoffeeMaker(boolean hastWorkToDo) {
        this.hastWorkToDo = hastWorkToDo;
    }
}
class DishWasher {

    private boolean hastWorkToDo;

    public DishWasher(boolean hastWorkToDo) {
        this.hastWorkToDo = hastWorkToDo;
    }
}
class Refrigerator {

    private boolean hastWorkToDo;

    public Refrigerator(boolean hastWorkToDo) {
        this.hastWorkToDo = hastWorkToDo;
    }
}