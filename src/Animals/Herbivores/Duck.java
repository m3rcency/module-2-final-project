package Animals.Herbivores;

import java.util.Random;
import Animals.Animals;
public class Duck extends Animals{
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
        return "\uD83E\uDD86";
    }
}
