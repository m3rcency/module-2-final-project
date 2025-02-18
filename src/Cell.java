import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Cell {
    private final int x;
    private final int y;
    public List<Animals> Organisms = new CopyOnWriteArrayList<>();
    public List<Grass> grass = new CopyOnWriteArrayList<>();
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
                Organisms.add(a);
            }
        }

    }

    public void spawnGrass(){
        int randomInt = ThreadLocalRandom.current().nextInt(1, Grass.getMaxAmountOnCell());
        for (int i = 1; i <= randomInt; i++) {
            grass.add(new Grass());
        }
    }
}
