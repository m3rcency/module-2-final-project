import java.util.concurrent.ThreadLocalRandom;


public abstract class Animals {
    int satiety;
    public abstract int getMaxMoveEndurance();
    public abstract int getWeight();
    public abstract int getMaxAmountOnCell();
    public int getCurrentSatiety(){
        return satiety;
    }
    public void setSatiety(int satiety){
        this.satiety = satiety;
    }
   public void move(int x, int y) {
       int moveDirection = ThreadLocalRandom.current().nextInt(1, 4);
       int move = ThreadLocalRandom.current().nextInt(this.getMaxMoveEndurance());
       Configure.map[y][x].organisms.remove(this);
       switch (moveDirection) {
           case 1 -> x = Math.max(0, x - move);
           case 2 -> y = Math.max(0, y - move);
           case 3 -> x = Math.min(Configure.map[0].length - 1, x + move);
           case 4 -> y = Math.min(Configure.map.length - 1, y + move);
       }
       Configure.map[y][x].organisms.add(this);
   }
    public void eat(){

    }
}
