import java.util.concurrent.RecursiveTask;

public class Bear extends Animals {
    @Override
    public int getMaxMoveEndurance(){
        return 2;
    }
    @Override
    public  int getWeight(){
        return 500;
    }
    @Override
    public int getMaxAmountOnCell(){
        return 5;
    }
    @Override
    public void eat(){
    }
    @Override
    public String toString(){
        return "\uD83D\uDC3B";
    }
}
