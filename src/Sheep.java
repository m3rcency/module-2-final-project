public class Sheep extends Animals {
    @Override
    public int getMaxMoveEndurance(){
        return 3;
    }
    @Override
    public void eat() {

    }
    @Override
    public int getMaxAmountOnCell(){
        return 140;
    }
    @Override
    public  int getWeight(){
        return 70;
    }
    @Override
    public String toString() {
        return "\uD83D\uDC11";
    }
}
