import java.util.*;
import java.util.concurrent.TimeUnit;

public class Configure {
    public final static  Map<Animals, Map<Object, Integer>> chances = new HashMap<>();
    public static List<Animals> animals = new ArrayList<>();
    public  static Cell[][]  map = new Cell[15][15];
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
        addHorseConfigure();
        addRabbitConfigure();
        addRatConfigure();
        addDuckConfigure();
        addSheepConfigure();
    }


    public static void addWolfConfigure() {
        Map<Object, Integer> wolfChances = new HashMap<>();
        wolfChances.put(new Horse(),10);
        wolfChances.put(new Rabbit(),60);
        wolfChances.put(new Rat(),80);
        wolfChances.put(new Duck(),40);
        wolfChances.put(new Sheep(),70);
        chances.put(new Wolf(), wolfChances);
    }
    public static void addBearConfigure(){
        Map<Object, Integer> bearChances = new HashMap<>();
        bearChances.put(new Horse(),40);
        bearChances.put(new Rabbit(),80);
        bearChances.put(new Rat(),90);
        bearChances.put(new Duck(),10);
        bearChances.put(new Sheep(),70);
        chances.put(new Bear(), bearChances);
    }
    public static void addHorseConfigure(){
        Map<Object, Integer> horseChances = new HashMap<>();
        horseChances.put(new Grass(), 100);
        chances.put(new Horse(),horseChances);
    }
    public static void addRabbitConfigure(){
        Map<Object, Integer> RabbitChances = new HashMap<>();
        RabbitChances.put(new Grass(), 100);
        chances.put(new Rabbit(), RabbitChances);
    }
    public static void addRatConfigure(){
        Map<Object, Integer> RatChances = new HashMap<>();
        RatChances.put(new Grass(), 100);
        chances.put(new Rat(), RatChances);
    }
    public static void addDuckConfigure(){
        Map<Object, Integer> DuckChances = new HashMap<>();
        DuckChances.put(new Grass(), 100);
        chances.put(new Duck(), DuckChances);
    }
    public static void addSheepConfigure(){
        Map<Object, Integer> SheepChances = new HashMap<>();
        SheepChances.put(new Grass(), 100);
        chances.put(new Sheep(), SheepChances);
    }
}
