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
    private static List <Hero> instances = new ArrayList<>();

    public Hero(String name,int Age,String specialAbility,String weakness,String ability){
        this.name =name;
        this.Age = Age;
        this.specialAbility =specialAbility;
        this.weakness = weakness;
        this.ability = ability;
        instances.add(this);/*every instance is automatically added to our arraylist*/
    }

    public String getName(){

    };

    public int getAge(){

    };

    public String getSpecialAbility(){

    };

    public String getWeakness(){

    };

    public String getAbility(){

    }

    public static List<Hero> getAll(){

    };
}
