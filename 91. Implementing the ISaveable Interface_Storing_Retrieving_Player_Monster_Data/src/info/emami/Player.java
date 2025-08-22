package info.emami;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name,  int hitPoints, int strength) {
        this.name = name;
        this.weapon = "Sword";
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName(){
        return this.name;
    }

    public String getWeapon(){
        return this.weapon;
    }

    public int getHitPoints(){
        return this.hitPoints;
    }

    public int getStrength(){
        return this.strength;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setWeapon(String weapon){
        this.weapon = weapon;
    }

    public void setHitPoints(int hitPoints){
        this.hitPoints = hitPoints;
    }

    public void setStrength(int strength){
        this.strength = strength;
    }

    public List<String> write(){

        List<String> values = new ArrayList<String>();
        values.add(0, name);
        values.add(1, weapon);
        values.add(2, ""+hitPoints);
        values.add(3, ""+strength);

        return values;
    }
}
