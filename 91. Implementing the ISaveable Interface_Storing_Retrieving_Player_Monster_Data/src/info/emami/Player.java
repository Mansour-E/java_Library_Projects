package info.emami;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{

    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;


    public Player(String name, int hitPoints, int strength, String weapon) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = weapon;
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
        values.add(1, ""+hitPoints);
        values.add(2, ""+strength);
        values.add(3, weapon);

        return values;
    }

    @Override
    public void read(List<String> list) {

        if (list == null) {
            return;
        }
        if (list.size() <= 0) {
            return;
        }

        name = list.get(0);
        hitPoints = Integer.parseInt(list.get(1));
        strength = Integer.parseInt(list.get(2));
        weapon = list.get(3);

    }

    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
