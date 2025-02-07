public class Duck extends Animals {
    @Override
    public int getMaxMoveEndurance(){
        return 4;
    }
    @Override
    public void eat() {

    }
    @Override
    public int getMaxAmountOnCell(){
        return 4;
    }
    @Override
    public  int getWeight(){
        return 1;
    }
    @Override
    public String toString() {
        return "\uD83E\uDD86";
    }
}
