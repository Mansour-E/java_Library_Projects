public class Main {

    public static void main(String[] args) {

        SmartKitchen kitchen = new SmartKitchen();

/*        kitchen.getDishWasher().setHastWorkToDo(true);
        kitchen.getIceBox().setHastWorkToDo(true);
        kitchen.getBrewMaster().setHastWorkToDo(true);

        kitchen.getDishWasher().doDishes();
        kitchen.getIceBox().orderFood();
        kitchen.getBrewMaster().brewCoffee();
*/

        kitchen.setKitchenState(true , false , true);
        kitchen.doKitchenWork();

        

    }
}
