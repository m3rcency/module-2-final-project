public class MapUtil {
    public static void createMap(){
        Configure.setAnimals();
        for (int i = 0; i < Configure.map.length; i++) {
            for(int j = 0; j < Configure.map[i].length; j++) {
                Configure.map[i][j] = new Cell(i, j);
                Configure.map[i][j].spawnAnimals();
            }
        }
    }
    public static void moveAllAnimals() {
        for (int i = 0; i < Configure.map.length; i++) {
            for (int j = 0; j < Configure.map[i].length; j++) {
               for(Animals a : Configure.map[i][j].organisms){
                   a.move(i, j);
               }
            }
        }
    }
    public static void printMap(){
        int k = 0;
        for (int i = 0; i < Configure.map.length; i++) {
            for (int j = 0; j < Configure.map[i].length; j++) {
                k++;
                System.out.print("Cell "+ k + " has " + Configure.map[i][j].organisms.size() + " Animals ");
            }
        }
        System.out.println();
    }

}
