import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.CopyOnWriteArrayList;
public class Cell {
    private final int x;
    private final int y;
    public List<Animals> organisms = new CopyOnWriteArrayList<>();
    public Cell(int y, int x) {
        this.y = y;
        this.x = x;
    }
   public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }


    @Override
   public String toString(){
        return "Cell" + " x is: " + getX() + " y is: " + getY();
    }

    public void spawnAnimals(){
        for(Animals a : Configure.animals){
            int randomInt = ThreadLocalRandom.current().nextInt(1, a.getMaxAmountOnCell());
            for(int i = 0; i < randomInt; i++){
                organisms.add(a);
            }
        }

    }

    public void spawnGrass(){

    }
}
