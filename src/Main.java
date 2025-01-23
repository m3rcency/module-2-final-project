import Food.Grass;

import java.util.*;
public class Main {
    public static Object[][] map = new Object[15][15];
    public static void main(String[] args) {
        Configure.setAnimals();
        Configure.createMap();
        Configure.spawnAnimals();
        Configure.printMap();

    }
}