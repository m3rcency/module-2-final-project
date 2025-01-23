package Animals.Herbivores;

import Animals.Animals;

import java.util.Random;

public class Rat extends Animals {
    Random random = new Random();
    private final int x = random.nextInt(15);
    private final int y = random.nextInt(15);
    @Override
    public int getX(){
        return this.x;
    }
    @Override
    public int getY(){
        return this.y;
    }
    @Override
    public void eat(){

    }
    @Override
    public void move(){

    }
    @Override
    public String toString(){
        return "\uD83D\uDC00";
    }
}
