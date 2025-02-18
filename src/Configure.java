import java.util.*;
import java.util.concurrent.TimeUnit;

public class Configure {
    public static  Map<Creature, Map<Creature, Integer>> chances = new HashMap<>();
    public static List<Animals> animals = new ArrayList<>();
    public static Cell[][]  map = new Cell[15][15];
    public static void setAnimals(){
        animals.add(new Bear());
        animals.add(new Duck());
        animals.add(new Horse());
        animals.add(new Rabbit());
        animals.add(new Rat());
        animals.add(new Sheep());
        animals.add(new Wolf());
        addWolfConfigure();
        addBearConfigure();



    }


    public static void addWolfConfigure() {
        Map<Creature, Integer> wolfChances = new HashMap<>();
        wolfChances.put(Creature.HORSE,10);
        wolfChances.put(Creature.RABBIT,60);
        wolfChances.put(Creature.RAT,80);
        wolfChances.put(Creature.DUCK,40);
        wolfChances.put(Creature.SHEEP,70);
        chances.put(Creature.WOLF, wolfChances);
    }
    public static void addBearConfigure(){
        Map<Creature, Integer> bearChances = new HashMap<>();
        bearChances.put(Creature.HORSE,40);
        bearChances.put(Creature.RABBIT,80);
        bearChances.put(Creature.RAT,90);
        bearChances.put(Creature.DUCK,10);
        bearChances.put(Creature.SHEEP,70);
        chances.put(Creature.BEAR, bearChances);
    }





}
