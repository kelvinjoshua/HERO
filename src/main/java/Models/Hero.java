package Models;

import java.util.List;
import java.util.ArrayList;

public class Hero {
    /*Hero attributes, static deals with classWide information */
    private String name;
    private int Age;
    private String specialAbility;
    private String weakness;
    private String ability;
    private int id;
    private static List<Hero> instances = new ArrayList<>();

    public Hero(String name, int Age, String specialAbility, String weakness, String ability) {
        this.name = name;
        this.Age = Age;
        this.specialAbility = specialAbility;
        this.weakness = weakness;
        this.ability = ability;
        this.id = instances.size();
        instances.add(this);/*every instance is automatically added to our arraylist*/
    }

    public String getName() {
        return name;
    }

    ;

    public int getAge() {
        return Age;
    }

    ;

    public String getSpecialAbility() {
        return specialAbility;
    }

    ;

    public String getWeakness() {
        return weakness;

    }

    ;

    public String getAbility() {
        return ability;
    }

    public int getId() {
        return id;
    }

    public static List<Hero> getAll() {
        return instances;
    }

    ;
}
