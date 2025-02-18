public class MapUtil {
    public static void createMap(){
            Configure.setAnimals();
            for (int i = 0; i < Configure.map.length; i++) {
                for(int j = 0; j < Configure.map[i].length; j++) {
                    Configure.map[i][j] = new Cell(i, j);
                    Configure.map[i][j].spawnAnimals();
                    Configure.map[i][j].spawnGrass();
                }
            }
        }
        public static void moveA() {
            for (int i = 0; i < Configure.map.length; i++) {
                for (int j = 0; j < Configure.map[i].length; j++) {
                    for (Animals a : Configure.map[i][j].Organisms) {
                        a.move(i, j);
                    }
                }
            }
        }
    public static void eatA() {
        for (int i = 0; i < Configure.map.length; i++) {
            for (int j = 0; j < Configure.map[i].length; j++) {
                for (Animals a : Configure.map[i][j].Organisms) {
                    a.eat(i, j);
                }
            }
        }
    }

    public static void printMap(){
        int k = 0;
        for (int i = 0; i < Configure.map.length; i++) {
            for (int j = 0; j < Configure.map[i].length; j++) {
                k++;
                System.out.print("Cell "+ k + " has " + (Configure.map[i][j].Organisms.size() + Configure.map[i][j].grass.size()) + " Objects " );
            }
        }
        System.out.println();
    }

}

