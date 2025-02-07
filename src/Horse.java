public class Horse extends Animals {
    @Override
    public int getMaxMoveEndurance(){
        return 4;
    }

    @Override
    public void eat() {

    }
    @Override
    public int getMaxAmountOnCell(){
        return 20;
    }
    @Override
    public  int getWeight(){
        return 400;
    }
    @Override
    public String toString() {
        return "\uD83D\uDC0E";
    }
}
