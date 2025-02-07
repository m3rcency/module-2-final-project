public class Rat extends Animals {
    @Override
    public int getMaxMoveEndurance(){
        return 1;
    }
    @Override
    public void eat() {

    }
    @Override
    public int getWeight(){
        return 1;
    }
    @Override
    public int getMaxAmountOnCell(){
        return 500;
    }
    @Override
    public String toString() {
        return "\uD83D\uDC00";
    }
}
