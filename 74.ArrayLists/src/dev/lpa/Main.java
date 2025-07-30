package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name , String type, int count){

    public GroceryItem(String name ){
        this(name , "DAIRY" , 1);
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}

public class Main{

    public static void main(String[] args) {

        //pass auf , fehler
        Object[] groceryArray = new Object[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples" , "PRODUCE" , 6);
        groceryArray[2] = "5 Oranges";
        System.out.println(Arrays.toString(groceryArray));

        //die korrekte version
        GroceryItem[] groceryyArray = new GroceryItem[3];
        groceryyArray[0] = new GroceryItem("milk");
        groceryyArray[1] = new GroceryItem("apples" , "PRODUCE" , 6);
        groceryyArray[2] = new GroceryItem("Oranges" , "PROODUCE" , 5);
        System.out.println(Arrays.toString(groceryyArray));

        //false
        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("yogurt");

        //true
        ArrayList<GroceryItem> groceryList = new ArrayList<GroceryItem>();
        groceryList.add(new GroceryItem("Butter"));
        //groceryList.add("yogurt"); geht nicht mehr weil die type ist GroceryItem
        groceryList.add(new GroceryItem("milk"));
        groceryList.add(new GroceryItem("oranges","PRODUCE" , 5));
        groceryList.add(0, new GroceryItem("apples" , "PRODUCE" , 6));

        System.out.println(groceryList);



    }
}
