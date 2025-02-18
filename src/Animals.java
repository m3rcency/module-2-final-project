import java.util.concurrent.ThreadLocalRandom;


public abstract class Animals {
    private int satiety = 0;
    public abstract int getMaxSatiety();
    public int getSatiety(){
        return satiety;
    }
    public void setSatiety(int satiety){
        this.satiety = satiety;
    }
    public abstract Creature getCreatureType();
    public abstract int getMaxMoveEndurance();
    public abstract int getWeight();
    public abstract int getMaxAmountOnCell();
    public void move(int x, int y) {
       int moveDirection = ThreadLocalRandom.current().nextInt(1, 4);
       int move = ThreadLocalRandom.current().nextInt(this.getMaxMoveEndurance());
       Configure.map[y][x].Organisms.remove(this);
       switch (moveDirection) {
           case 1 -> x = Math.max(0, x - move);
           case 2 -> y = Math.max(0, y - move);
           case 3 -> x = Math.min(Configure.map[0].length - 1, x + move);
           case 4 -> y = Math.min(Configure.map.length - 1, y + move);
       }
       Configure.map[y][x].Organisms.add(this);
   }

    public abstract void eat(int x, int y);
}

